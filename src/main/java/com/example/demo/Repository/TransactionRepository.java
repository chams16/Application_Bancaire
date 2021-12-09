package com.example.demo.Repository;

import com.example.demo.Model.Transaction;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends org.springframework.data.jpa.repository.JpaRepository<Transaction, Long> {
}
