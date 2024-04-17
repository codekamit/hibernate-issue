package com.hibernate.learn.DTOs.performance_dto_1;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FindAuthorWithIdByBooks {
    private Long authorId;
    private String authorName;
    private int authorAge;
    private String bookTitle;

    public static FindAuthorWithIdByBooks from(Object[] tuple) {
        return new FindAuthorWithIdByBooks(
                (Long) tuple[0],
                (String) tuple[1],
                (int) tuple[2],
                (String) tuple[3]
        );
    }
}
