package com.geekster.University.Event.Managment.Repository;

import com.geekster.University.Event.Managment.model.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentRepo extends CrudRepository<Student,Integer> {
    @Query(value = "select * from student",nativeQuery = true)
    public List<Student> getallstudent();


    public List<Student> findStudentByStudentId(Integer id);
    @Modifying
    @Query(value = "update student set department= :dep where first_name= :name",nativeQuery = true)
    public void updatedepartment(String dep,String name);

}
