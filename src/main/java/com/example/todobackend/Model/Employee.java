package com.example.todobackend.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "fName")
    private String fName;

    @Column(name = "lName")
    private String lName;

    private int age;

    @Column(name = "phone")
    private BigInteger phone;

    @Column(name = "emailId")
    private String emailId;

    public Employee(){
    }

    public Employee(int id, String fName, String lName, int age, BigInteger phone, String emailId) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.phone = phone;
        this.emailId = emailId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public BigInteger getPhone() {
        return phone;
    }

    public void setPhone(BigInteger phone) {
        this.phone = phone;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
