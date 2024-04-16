package com.hibernate.learn.repositiories.basic_repository;

import com.hibernate.learn.models.basic_model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
