package com.example.demo.controller;

import java.util.collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Studentity;
import com.example.demo.service.StudentService;
@RestController
@RequestMapping("/student")
public class StudentController{
    @Autowired
    private StudentService ser;

    //post
    @PostMapping("/add")
    public Studentity addStudent(@RequestBody Studentity st){
        return ser.saveData(st);
    }
    //GET ALL
    @GetMapping("/getall")
    public  Collection<Studentity>getAllstudents(){
        return ser.getAll();
    }
    //GET BY ID
    @GetMapping("/get/{id}")
    public Studentity getStudentById(@)
}

