package com.example.DataJPA_1.repository;

import com.example.DataJPA_1.entity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

public interface EmpRepository extends CrudRepository<Employee, Serializable> {

}
