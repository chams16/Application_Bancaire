package com.example.demo;

import com.example.demo.Model.Bank_Agent;
import com.example.demo.Repository.BankAgentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;

@Slf4j
@SpringBootApplication
public class ApplicationBancaireApplication  {
    @Autowired
    private BankAgentRepository bankAgentRepository;


    @Autowired
    private JavaMailSender javaMailSender;
    public static void main(String[] args) {
        SpringApplication.run(ApplicationBancaireApplication.class, args);
    }

    @PostConstruct
    public void init() {
        Bank_Agent agent = new Bank_Agent();
        agent.setName("admin");
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        agent.setPassword(encoder.encode("admin1234"));
        agent.setEmail("chamseddine1119@gmail.com");
        agent.setBank_name("firstBank");
        agent.setAdresse("sousse");
        agent.setAgency_address("sahloul");

        if (!bankAgentRepository.existsByName(agent.getName())) {
            bankAgentRepository.save(agent);
            log.info("creating the admin of bank agency");
        }
        else {
            log.info("admin is already exist");
            System.out.println("admin already exist");
        }
    }
}
