package com.example.todobackend.repo;

import com.example.todobackend.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    Employee findByemailId(String e);
}
