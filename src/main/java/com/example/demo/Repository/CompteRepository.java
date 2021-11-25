package com.example.demo.Repository;

import com.example.demo.Model.Compte_Bancaire;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends CompteBaseRepository<Compte_Bancaire> {
}
