package com.hibernate.learn.DTOs.performance_dto_1;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookResponseDTO {
    private Long bookId;
    private String bookTitle;
}
