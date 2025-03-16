package com.example.todobackend.Controller;

import com.example.todobackend.Model.Employee;
import com.example.todobackend.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmloyeeDetail(@PathVariable int id){
        Employee t=service.getDatabyEmployeeId(id);
        if(t.getId()==-1) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(service.getDatabyEmployeeId(id));
    }

    @DeleteMapping("/employee/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable int id){
        String s=service.deleteEmployee(id);
        return ResponseEntity.ok(s);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addEmployee(@RequestBody Employee e){
        String res=service.addEmployee(e);
        if(res=="Success")return ResponseEntity.ok(res);
        else return ResponseEntity.notFound().build();
    }
}
