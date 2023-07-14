package com.example.demo.Controller;

import com.example.demo.Entity.EmployeeEntity;
import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.Storage.EmployeeStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping(
            path = "/",
            produces = "application/json"
    )
    public EmployeeStorage getEmployees(){
        return
        employeeRepository.getAllEmployees();
    }

    @PostMapping(
            path = "/",
            produces = "application/json",
            consumes = "application/json"
    )
    public ResponseEntity<Object> addEmployees(@RequestBody EmployeeEntity employee){
        Long Id = (long) (employeeRepository.getAllEmployees().getEmployeeList().size()+1);
        employee.setEmployeeId(Id);
        employeeRepository.addEmployee(employee);

        URI location= ServletUriComponentsBuilder.
                    fromCurrentRequest().path("/{id}").
                    buildAndExpand(
                            employee.getEmployeeId()
                    ).toUri();
                return ResponseEntity.created(location).build();
    }

}
