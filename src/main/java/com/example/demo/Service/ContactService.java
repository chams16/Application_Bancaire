package com.example.demo.Service;

import com.example.demo.Model.ContactForm;

import java.util.List;

public interface ContactService {

    ContactForm SendMail(ContactForm contactForm);
    List<ContactForm> getAllMailSent();
}
