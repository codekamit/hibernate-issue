package com.hibernate.learn.services.basic_service;

import com.hibernate.learn.repositiories.basic_repository.DepartmentRepository;
import com.hibernate.learn.models.basic_model.Department;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DepartmentService {

    private final DepartmentRepository departmentRepository;
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }
}
