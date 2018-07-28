package com.assaabloy.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assaabloy.backend.data.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
