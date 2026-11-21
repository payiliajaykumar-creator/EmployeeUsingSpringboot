
package com.example.Employe.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Employe.Service.EmployeeService;
import com.example.Employe.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {

        return employeeService.saveEmployee(employee);
    }
}
