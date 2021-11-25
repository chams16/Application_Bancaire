package com.example.demo.Controller;

import com.example.demo.Model.Carte;
import com.example.demo.Service.ServiceImpl.CartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carte")
public class CarteController {

    @Autowired
    private CartServiceImpl cartService;

    @PostMapping("/create")
    public Carte CreateCart(@RequestBody Carte carte){
        return cartService.addCarte(carte);
    }

    @GetMapping("/all")
    public List<Carte> GetAllCarte(){
        return cartService.getAllCarte();
    }
}
