package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(scanBasePackages = "com.example")
@ImportResource("classpath:employee.xml")  // ✅ Load XML once here only
public class EmployeeManagementsApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmployeeManagementsApplication.class, args);
    }
}
