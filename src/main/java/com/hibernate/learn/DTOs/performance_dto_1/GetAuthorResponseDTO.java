package com.hibernate.learn.DTOs.performance_dto_1;

import lombok.*;

import java.security.cert.CertPathBuilder;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetAuthorResponseDTO {
    private Long authorId;
    private String authorName;
    private List<BookResponseDTO> booksPublished;
}
