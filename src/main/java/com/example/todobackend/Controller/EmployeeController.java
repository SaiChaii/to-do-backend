package com.example.todobackend.Controller;

import com.example.todobackend.Model.Employee;
import com.example.todobackend.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/all")
    private ResponseEntity<List<Employee>> getAll(){
        List<Employee> val=service.getAll();
        if(val!=null) return ResponseEntity.ok(val);
        else return ResponseEntity.notFound().build();
    }

    @PostMapping("/add")
    public ResponseEntity<String> addEmployee(@RequestBody Employee e){
        String res=service.addEmployee(e);
        if(res=="Success")return ResponseEntity.ok(res);
        else return ResponseEntity.notFound().build();
    }
}
