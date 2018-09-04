package com.mvc.mysql.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mvc.mysql.model.EmployeeModel;
import com.mvc.mysql.repo.EmployeeRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class EmpServiceController {

	@Autowired
	EmployeeRepository repository;

	@GetMapping("/customers")
	public List<EmployeeModel> getAllCustomers() {
		System.out.println("Get all Customers...");

		List<EmployeeModel> customers = new ArrayList<>();
		repository.findAll().forEach(customers::add);

		return customers;
	}

	@PostMapping(value = "/customers/create")
	public EmployeeModel postCustomer(@RequestBody EmployeeModel customer) {

		EmployeeModel _customer = repository.save(new EmployeeModel(customer.getName(), customer.getAge()));
		return _customer;
	}

	

	

	

	
}
