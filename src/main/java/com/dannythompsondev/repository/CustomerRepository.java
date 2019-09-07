package com.dannythompsondev.repository;

import org.springframework.data.repository.CrudRepository;

import com.dannythompsondev.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
