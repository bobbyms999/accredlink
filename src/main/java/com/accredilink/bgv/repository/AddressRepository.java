package com.accredilink.bgv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accredilink.bgv.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
