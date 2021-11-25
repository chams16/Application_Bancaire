package com.example.demo.Repository;

import com.example.demo.Model.Virement;
import org.springframework.stereotype.Repository;

@Repository
public interface VirementRepository extends TransactionBaseRepository<Virement> {
}
