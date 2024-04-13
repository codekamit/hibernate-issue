package com.hibernate.learn.services;

import com.hibernate.learn.repositiories.DepartmentRepository;
import com.hibernate.learn.models.Department;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DepartmentService {

    private DepartmentRepository departmentRepository;
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }
}
