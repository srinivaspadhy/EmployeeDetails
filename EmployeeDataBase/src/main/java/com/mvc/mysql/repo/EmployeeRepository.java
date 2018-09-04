package com.mvc.mysql.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mvc.mysql.model.EmployeeModel;

public interface EmployeeRepository extends CrudRepository<EmployeeModel, Long> {
	List<EmployeeModel> findByAge(int age);
}
