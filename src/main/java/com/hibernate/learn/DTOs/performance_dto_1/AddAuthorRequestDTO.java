package com.hibernate.learn.DTOs.performance_dto_1;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddAuthorRequestDTO {
    private String authorName;
    private int age;
}
