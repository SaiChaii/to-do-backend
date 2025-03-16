package com.example.todobackend.Service;

import com.example.todobackend.Model.Employee;
import com.example.todobackend.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
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

    public Employee getDatabyEmployeeId(int id) {
        Employee e=repo.findById(id).orElse(new Employee(-1,"NO","Value",0,new BigInteger("0000000000") ,"no@val.com"));
        return e;
    }

    public String deleteEmployee(int id) {
        repo.deleteById(id);
        return "Success";
    }
}
