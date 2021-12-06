package com.example.demo.Util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class SendMail {

    @Autowired
    private JavaMailSender mailSender;

    public String Sendmail(String toEmail,String text, String subject){
        System.out.println("sending start........");

        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("chamseddine1119@gmail.com");
        message.setTo(toEmail);
        message.setText(text);

        message.setSubject(subject);
        mailSender.send(message);
        return "mail sent successfully";
    }


}
