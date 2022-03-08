package com.tm.rest.restfulwebservices;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class EmployeeDaoService {

    private static List<Employee> employees=new ArrayList<>();
    static{

        employees.add(new Employee(1,"Adam",23));
        employees.add(new Employee(2,"eve",22));
        employees.add(new Employee(3,"Charles",25));


    }
    public List<Employee> findAll()
    {
        return employees;
    }

    public Employee save(Employee employee)
    {
        employees.add(employee);
    return  employee;
    }

    public Employee findOne(int id){
    for(Employee employee:employees)
    {
        if(employee.getId()==id){
            return employee;
        }
    }
        return null;
    }

    public Employee deleteById(int id){
        Iterator<Employee> iterator=employees.iterator();
        while(iterator.hasNext())
        {Employee employee=iterator.next();
            if(employee.getId()==id){
                iterator.remove();
                return employee;
            }
        }
        return null;
    }



}


















