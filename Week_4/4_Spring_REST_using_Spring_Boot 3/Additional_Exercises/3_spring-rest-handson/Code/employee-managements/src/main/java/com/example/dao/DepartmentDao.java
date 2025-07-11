package com.example.dao;

import com.example.model.Department;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentDao {

    public static List<Department> DEPARTMENT_LIST;

    @Resource(name = "departments")  // ✅ Pull from XML bean named 'departments'
    public void setDepartments(List<Department> departments) {
        DEPARTMENT_LIST = departments;
    }

    public List<Department> getAllDepartments() {
        return DEPARTMENT_LIST;
    }
}
