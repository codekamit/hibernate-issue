package com.hibernate.learn.models.performance_model_1;

import com.hibernate.learn.models.BaseModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Author extends BaseModel {

    private String authorName;
    private int age;
    //1. cascading should always be from Parent to Child (assuming Author as parent and Books as its child)
    //2. mapped by property should also be from the Parent to Child
    //3. orphanRemoval is to ensure that no null references are stored for books i.e. book should not exist in the database with Author as null
    //4. By default, @OneToMany association are lazy fetched. (It is a good practice to have both @OneToMany and @ManyToOne set as lazy)
    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "bookAuthor",
            orphanRemoval = true)
    private List<Book> booksPublished;

    public void addBook(Book book) {
        this.booksPublished.add(book);
        book.setBookAuthor(this);
    }
    public void removeBook(Book book) {
        this.booksPublished.remove(book);
        book.setBookAuthor(null);
    }
}
