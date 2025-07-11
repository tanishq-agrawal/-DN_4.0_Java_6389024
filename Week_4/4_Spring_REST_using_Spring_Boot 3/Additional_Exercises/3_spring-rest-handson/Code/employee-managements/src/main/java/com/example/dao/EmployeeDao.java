package com.example.dao;

import com.example.model.Employee;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDao {

    @Resource(name = "employees")
    private List<Employee> employees;

    public List<Employee> getAllEmployees() {
        return employees;
    }
}
