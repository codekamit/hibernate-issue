package com.hibernate.learn.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String deptartmentName;
    @OneToMany(mappedBy = "department")
    private List<Employee> employees;
}
