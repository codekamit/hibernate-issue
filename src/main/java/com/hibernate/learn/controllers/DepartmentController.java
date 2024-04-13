package com.hibernate.learn.controllers;

import com.hibernate.learn.models.Department;
import com.hibernate.learn.services.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class DepartmentController {

    private DepartmentService departmentService;

    @GetMapping("departments")
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }
}
