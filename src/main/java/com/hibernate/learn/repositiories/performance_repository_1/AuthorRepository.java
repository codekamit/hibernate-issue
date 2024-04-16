package com.hibernate.learn.repositiories.performance_repository_1;

import com.hibernate.learn.models.performance_model_1.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}