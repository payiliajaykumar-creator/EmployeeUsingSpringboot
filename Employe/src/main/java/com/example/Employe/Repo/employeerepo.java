package com.example.Employe.Repo;

import com.example.Employe.Repo.employeerepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Employe.model.Employee;

@Repository
public interface employeerepo extends JpaRepository<Employee  ,Integer> {

}
