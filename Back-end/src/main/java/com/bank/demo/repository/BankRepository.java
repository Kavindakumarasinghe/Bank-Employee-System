package com.bank.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.demo.model.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank, Integer> {

}
