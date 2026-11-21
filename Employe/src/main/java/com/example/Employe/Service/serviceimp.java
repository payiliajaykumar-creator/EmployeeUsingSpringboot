
package com.example.Employe.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Employe.Repo.employeerepo;
import com.example.Employe.model.Employee;

@Service
public class serviceimp implements EmployeeService {

    @Autowired
    employeerepo employeerepo;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeerepo.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeerepo.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(int employeeId) {
        return employeerepo.findById(employeeId);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeerepo.save(employee);
    }

    @Override
    public void deleteEmployee(int employeeId) {
        employeerepo.deleteById(employeeId);
    }
}

