package com.example.demo.Repository;

import com.example.demo.Entity.EmployeeEntity;
import com.example.demo.Storage.EmployeeStorage;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
    private static EmployeeStorage list
            = new EmployeeStorage();

    /*
     * This static block is executed
     * before executing the main
     * block
     */
    static
    {

        // Creating a few employees
        // and adding them to the list
        list.getEmployeeList().add(
                new EmployeeEntity(
                        1L,
                        "Prem",
                        "Tiwari",
                        "chapradreams@gmail.com"));

        list.getEmployeeList().add(
                new EmployeeEntity(
                        2L, "Vikash",
                        "Kumar",
                        "abc@gmail.com"));

        list.getEmployeeList().add(
                new EmployeeEntity(
                        3L, "Ritesh",
                        "Ojha",
                        "asdjf@gmail.com"));


    }

    // Method to return the list
    public EmployeeStorage getAllEmployees()
    {
        return list;
    }


    // Method to add an employee
    // to the employees list
    public void
    addEmployee(EmployeeEntity employee)
    {
        list.getEmployeeList()
                .add(employee);

    }
}
