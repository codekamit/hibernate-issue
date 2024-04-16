package com.hibernate.learn.models.performance_model_1;

import com.hibernate.learn.models.BaseModel;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book extends BaseModel {

    private String bookTitle;
    //1. marking @ManyToOne as lazy.
    //2. @JoinColumn stores the ID value and has a foreign
    //key to the Author entity. It is advisable to specify the desired name for this column.
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="author_id")
    private Author bookAuthor;
    /* Ensure to only include basic attributes to the toString() method, as if you would include attributes that are lazily loaded
    it would trigger additional SQL queries */

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        if(obj == this) {
            return true;
        }
        if(getClass() != obj.getClass()) {
            return false;
        }
        return getId() != null && getId().equals(((Book) obj).getId());
    }

    @Override
    public int hashCode() {
        return 2021;
    }
}
