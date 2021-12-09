package com.example.demo.Controller;

import com.example.demo.Model.Entreprise;
import com.example.demo.Service.ServiceImpl.EntrepriseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/entreprise")
public class EntrepriseController {

    @Autowired
    private EntrepriseImpl entrepriseService;
    




    @Transactional
    @PostMapping("/signup")
    public Entreprise AjouterEntreprise(@RequestBody Entreprise entreprise){
        return entrepriseService.ajouterEntreprise(entreprise);
    }

    @PostMapping("/signin")
    public String authentifier(@RequestBody Entreprise entreprise){
        return "authentificatio de l'entreprise en cours ....";
    }

    @GetMapping("/all")
    public List<Entreprise> getAllEntreprise(){
     return entrepriseService.getAllEntreprise();

    }

    @DeleteMapping("/del/{id}")
    public void delete(@PathVariable("id") Long id){
        entrepriseService.DeleteById(id);
    }

    @GetMapping("/get/id/{id}")
    public Optional<Entreprise> getEntrepriseById(@PathVariable("id") Long id){
        return entrepriseService.GetEntrepriseById(id);
    }

    @GetMapping("/name/{ent_name}")
    public String getEntrepriseByI(@PathVariable("ent_name") String ent_name){
        String result = "verify the service for this method";
        return  result;
    }

    @GetMapping("matricule/{matricule}")
    public String getEntrepriseById(@PathVariable("matricule") int matricule){
        String result = "verify the service for this method";
        return  result;
    }

    @PostMapping("/update")
    public Entreprise changePassword(@RequestParam("password") String password){
        return entrepriseService.modifierPassword(password);
    }




}
