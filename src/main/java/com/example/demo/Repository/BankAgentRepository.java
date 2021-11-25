package com.example.demo.Repository;

import com.example.demo.Model.Bank_Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAgentRepository extends JpaRepository<Bank_Agent,Long> {
}
