package com.example.demo.Controller;

import com.example.demo.Services.StudentServices;
import com.example.demo.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentServices services;
    @GetMapping(
            path = "/",
            produces = "application/json"
    )
    public List<StudentEntity> getStudents(){
        return
        services.getStudents();
    }

    @PostMapping(
            path="/",
            consumes = "application/json",
            produces = "application/json"
    )
    public ResponseEntity<Object> setStudents(@RequestBody StudentEntity student){
              services.setStudents(student);
              return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudents(@PathVariable  int id){
        services.removeStudents(id);
        return ResponseEntity.ok("Student deleted Sucsefully");
    }
}
