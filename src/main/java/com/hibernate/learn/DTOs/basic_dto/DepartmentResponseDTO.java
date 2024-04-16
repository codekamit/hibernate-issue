package com.hibernate.learn.DTOs.basic_dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class DepartmentResponseDTO {
    private Long departmentId;
    private String departmentName;
    private List<EmployeeResponse> employees;
}
