package com.example.employeeapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "employees")
@Data
public class Employee {
    @Id
    private String employeeId;
    private String name;
    private String email;
    private String location;

}
