package com.example.demo.Services;


import com.example.demo.Repository.StudentRepository;
import com.example.demo.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {

    @Autowired
    private StudentRepository repo;

    public List<StudentEntity> getStudents (){
        return repo.findAll();
    }

    public List<StudentEntity> setStudents (StudentEntity student){
        repo.save(student);
        return repo.findAll();
    }

    public List<StudentEntity> removeStudents (int id ){
        repo.deleteById(id);
        return repo.findAll();
    }

}
