package com.example.todobackend.Service;

import com.example.todobackend.Model.Employee;
import com.example.todobackend.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo repo;

    public List<Employee> getAll() {
        System.out.println(repo.findAll());
        return repo.findAll();
    }

    public String addEmployee(Employee e) {
        String email=e.getEmailId();
        Employee isAlreadyPresent=repo.findByemailId(email);
        System.out.println(isAlreadyPresent);
        if(isAlreadyPresent==null){
            repo.save(e);
            return "Success";
        }
        return "Failed";
    }
}
