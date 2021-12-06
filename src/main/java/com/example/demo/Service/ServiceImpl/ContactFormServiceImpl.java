package com.example.demo.Service.ServiceImpl;

import com.example.demo.Config.MailConfig;
import com.example.demo.Model.ContactForm;
import com.example.demo.Repository.ContactRepository;
import com.example.demo.Service.ContactService;
import com.example.demo.Util.SendMail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactFormServiceImpl implements ContactService {
    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    private SendMail sendMail;

    @Override
    public ContactForm SendMail(ContactForm contactForm) {

        sendMail.Sendmail(contactForm.getReceiver(),contactForm.getText(),contactForm.getSubject());
        return contactRepository.save(contactForm);
    }

    @Override
    public List<ContactForm> getAllMailSent() {
        return contactRepository.findAll();
    }
}
