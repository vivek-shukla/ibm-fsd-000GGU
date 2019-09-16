package com.example.FSD_13_09_2019_Employee_Inheritance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.FSD_13_09_2019_Employee_Inheritance.entity.ContractualEmployee;

@Repository
public interface ContractualEmployeeRepository extends CrudRepository<ContractualEmployee, Integer> {

}
