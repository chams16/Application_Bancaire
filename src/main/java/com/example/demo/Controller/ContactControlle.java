package com.example.demo.Controller;

import com.example.demo.Model.ContactForm;
import com.example.demo.Service.ServiceImpl.ContactFormServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactControlle {

    @Autowired
    private ContactFormServiceImpl formService;

    @PostMapping("/send")
    public ContactForm Contact(@RequestBody ContactForm contactForm){
        return formService.SendMail(contactForm);
    }

    @GetMapping("/get")
    public List<ContactForm> getAllMailSent(){
        return formService.getAllMailSent();
    }
}
