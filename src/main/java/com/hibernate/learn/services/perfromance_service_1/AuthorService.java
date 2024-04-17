package com.hibernate.learn.services.perfromance_service_1;

import com.hibernate.learn.DTOs.performance_dto_1.AddAuthorRequestDTO;
import com.hibernate.learn.DTOs.performance_dto_1.AddBookRequestDTO;
import com.hibernate.learn.DTOs.performance_dto_1.FindAuthorWithIdByBooks;
import com.hibernate.learn.DTOs.performance_dto_1.GetAuthorResponseDTO;
import com.hibernate.learn.models.performance_model_1.Author;
import com.hibernate.learn.models.performance_model_1.Book;
import com.hibernate.learn.repositiories.performance_repository_1.AuthorRepository;
import com.hibernate.learn.repositiories.performance_repository_1.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AuthorService {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public void addBook(AddBookRequestDTO requestDTO, Long authorId) {
        Author author = authorRepository.findById(authorId).get();
        Book book = Book.builder()
                .bookTitle(requestDTO.getBookTitle())
                .build();
        author.addBook(book);
        authorRepository.save(author);
    }

    public void addAuthor(AddAuthorRequestDTO requestDTO) {
        Author author = Author.builder()
                .authorName(requestDTO.getAuthorName())
                .age(requestDTO.getAge())
                .build();
        authorRepository.save(author);
    }

    public void removeBook(Long authorId, Long bookId) {
        Author author = authorRepository.findById(authorId).get();
        Book book = bookRepository.findById(bookId).get();
        author.removeBook(book);
        authorRepository.save(author);
    }
    public List<FindAuthorWithIdByBooks> getAuthor(Long authorId) {
        return authorRepository.findAuthorWithAllHisBooks(authorId);
    }
}
