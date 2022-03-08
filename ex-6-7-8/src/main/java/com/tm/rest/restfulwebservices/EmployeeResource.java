package com.tm.rest.restfulwebservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeResource {
    @Autowired
    private EmployeeDaoService service;
    @GetMapping("/employees")
    public List<Employee> retrieveAllUsers(){

        return service.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee retrieveEmployee(@PathVariable int id)
    {
        Employee employee=service.findOne(id);
        if(employee==null)
            throw new EmployeeNotFoundException("id -" + id);

        return employee;


    }

@PostMapping("/employees")
    public void createEmployee(@RequestBody Employee employee)
{
Employee savedEmployee=service.save(employee);
}



    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable int id)
    {
        Employee employee=service.deleteById(id);
        if(employee==null)
            throw new EmployeeNotFoundException("id -" + id);


    }




}



















