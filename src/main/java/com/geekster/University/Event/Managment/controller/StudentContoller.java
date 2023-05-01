package com.geekster.University.Event.Managment.controller;

import com.geekster.University.Event.Managment.model.DepartmentType;
import com.geekster.University.Event.Managment.model.Student;
import com.geekster.University.Event.Managment.service.StudentService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentContoller {
    @Autowired
    StudentService ss;

    @GetMapping(value = "/allstudent")
    public List<Student> getallstudent(){
        return ss.getallstudent();
    }
    @GetMapping(value = "/studentbyid/{id}")
    public List<Student> studentbyid(@PathVariable Integer id){
         return ss.studentbyid(id);
    }

    @PostMapping(value = "/addstudent")
    public String addstudent(@RequestBody List<Student> stu){
        return ss.addstudent(stu);
    }
    @PutMapping(value = "/update/{department}/{name}")
    public void updatedep(@PathVariable DepartmentType department,@PathVariable String name){
        ss.updatedepartment(department,name);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deletdbyid(@PathVariable Integer id){
        ss.deletebyid(id);
    }
}
