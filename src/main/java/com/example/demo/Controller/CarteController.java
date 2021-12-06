package com.example.demo.Controller;

import com.example.demo.Model.Carte;
import com.example.demo.Repository.CarteRepository;
import com.example.demo.Repository.EntrepriseRepository;
import com.example.demo.Service.ServiceImpl.CartServiceImpl;
import com.example.demo.Service.ServiceImpl.EntrepriseImpl;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carte")
public class CarteController {

    @Autowired
    private CartServiceImpl cartService;
    @Autowired
    private CarteRepository carteRepository;
    @Autowired
    private EntrepriseRepository entrepriseRepository;



    @PostMapping("/create/{entrepriseId}")
    public Carte CreateCart(@RequestBody Carte carte,@PathVariable Long entrepriseId){

        return cartService.addCarte(carte,entrepriseId);
    }

    @GetMapping("/all")
    public List<Carte> GetAllCarte(){
        return cartService.getAllCarte();
    }

    @GetMapping("/{entrepriseId}")
    public List<Carte> getCarteByEntreprise(@PathVariable Long entrepriseId){
        return cartService.getCarteByEntreprise(entrepriseId);
    }
}
