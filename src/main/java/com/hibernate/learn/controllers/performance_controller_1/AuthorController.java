package com.hibernate.learn.controllers.performance_controller_1;

import com.hibernate.learn.DTOs.performance_dto_1.AddAuthorRequestDTO;
import com.hibernate.learn.DTOs.performance_dto_1.AddBookRequestDTO;
import com.hibernate.learn.models.performance_model_1.Book;
import com.hibernate.learn.services.perfromance_service_1.AuthorService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("authors")
@AllArgsConstructor
public class AuthorController {

    private final AuthorService authorService;
    @PostMapping("books")
    public void addBook(@RequestBody AddBookRequestDTO requestDTO, @RequestParam(required = true) Long authorId) {
        authorService.addBook(requestDTO, authorId);
    }

    @PostMapping()
    public void addAuthor(@RequestBody AddAuthorRequestDTO requestDTO) {
        authorService.addAuthor(requestDTO);
    }
}
