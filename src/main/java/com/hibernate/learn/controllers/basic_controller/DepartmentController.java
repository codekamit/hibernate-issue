package com.hibernate.learn.controllers.basic_controller;

import com.hibernate.learn.models.basic_model.Department;
import com.hibernate.learn.services.basic_service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class DepartmentController {

    private final DepartmentService departmentService;

    @GetMapping("departments")
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }
}
