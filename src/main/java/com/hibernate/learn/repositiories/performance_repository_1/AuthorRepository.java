package com.hibernate.learn.repositiories.performance_repository_1;

import com.hibernate.learn.DTOs.performance_dto_1.FindAuthorWithIdByBooks;
import com.hibernate.learn.models.performance_model_1.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    Optional<Author> findByIdIs(Long authorId);

    @Query("SELECT a FROM Author a JOIN FETCH a.booksPublished b WHERE a.id = :authorId")
    Optional<Author> findAuthorWithBooksById(@Param("authorId") Long authorId);

    @Query("SELECT a.id as authorId, a.authorName as authorName, b.bookTitle as bookTitle " +
            "FROM Author a " +
            "JOIN Book b ON a.id = b.bookAuthor.id")
    List<Object[]> findAuthorsWithBooks();

    @Query(value = "select t.id as authorId, t.author_name as authorName, t.age as authorAge, b.book_title as bookTitle " +
            "from (select id, age, author_name " +
            "from Author " +
            "where id = :authorId) as t " +
            "left join Book b "+
            "on t.id = b.author_id", nativeQuery = true)
    List<FindAuthorWithIdByBooks> findAuthorWithAllHisBooks(@Param("authorId") Long authorId);
}