package com.example.demo.Controller;

import com.example.demo.Service.ServiceImpl.CompteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compte")
public class CompteController {

    @Autowired
    private CompteServiceImpl compteService;
}
