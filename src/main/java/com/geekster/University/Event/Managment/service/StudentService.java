package com.geekster.University.Event.Managment.service;

import com.geekster.University.Event.Managment.Repository.IStudentRepo;
import com.geekster.University.Event.Managment.model.DepartmentType;
import com.geekster.University.Event.Managment.model.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    IStudentRepo sr;
    public List<Student> getallstudent() {
        return sr.getallstudent();
    }
    public String addstudent(List<Student> stu) {
        Iterable<Student> list=sr.saveAll(stu);
        if(list!=null){
            return "Student details added successfully...!";
        }
        return "Failed to store details";
    }

    @Transactional
    public void updatedepartment(DepartmentType department, String name) {
        String depart=department.name();
        sr.updatedepartment(depart,name);
    }

    @Transactional
    public void deletebyid(Integer id) {
        sr.deleteById(id);
    }

    public List<Student> studentbyid(Integer id) {
        return sr.findStudentByStudentId(id);
    }
}
