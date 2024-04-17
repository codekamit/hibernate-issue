package com.hibernate.learn.repositiories.performance_repository_1;

import com.hibernate.learn.models.performance_model_1.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
