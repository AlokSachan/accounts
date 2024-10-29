package com.alok.accounts.repository;

import com.alok.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByMobileNumber(String mobileNumber);

    void deleteByCustomerId(Long customerId);
}
