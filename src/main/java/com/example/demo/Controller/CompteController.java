package com.example.demo.Controller;

import com.example.demo.Model.Compte_Bancaire;
import com.example.demo.Service.ServiceImpl.CompteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/compte")
public class CompteController {

    @Autowired
    private CompteServiceImpl compteService;

    @GetMapping("/all")
    public List<Compte_Bancaire> getAccount(){
        return compteService.getAllAccount();
    }

    @PostMapping("/{entrepriseId}")
    public Compte_Bancaire CreateAccount(@RequestBody Compte_Bancaire compte,@PathVariable Long entrepriseId){
        return compteService.createNewAccount(compte,entrepriseId);
    }

    @GetMapping("/entreprise/{entrepriseId}")
    public List<Compte_Bancaire> getAccountByEntreprise(@PathVariable Long entrepriseId){
        return compteService.getAccountByEntreprise(entrepriseId);
    }
}
