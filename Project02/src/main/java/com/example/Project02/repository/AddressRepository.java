package com.example.Project02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Project02.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
    
}