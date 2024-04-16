package com.hibernate.learn.DTOs.basic_dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class EmployeeResponse {
    private Long employeeId;
    private String employeeName;
    private int employeeAge;
}
