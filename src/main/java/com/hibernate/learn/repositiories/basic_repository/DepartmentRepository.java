package com.hibernate.learn.repositiories.basic_repository;

import com.hibernate.learn.models.basic_model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    @Override
    List<Department> findAll();
}
