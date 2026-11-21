package com.example.Employe.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Employe.model.Employee;


///what to do    in interface 



public interface EmployeeService {

	  
	 Employee saveEmployee(Employee employee);
	
	

    // Read all employees
    List<Employee> getAllEmployees();

    // Read employee by ID
    Optional<Employee> getEmployeeById(int employeeId);

    // Update employee
    Employee updateEmployee(Employee employee);

    // Delete employee
    void deleteEmployee(int employeeId);

	
}
