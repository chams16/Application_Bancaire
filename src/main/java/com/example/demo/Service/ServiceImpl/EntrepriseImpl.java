package com.example.demo.Service.ServiceImpl;

import com.example.demo.Model.Compte_Bancaire;
import com.example.demo.Model.Entreprise;
import com.example.demo.Model.Professionelle;
import com.example.demo.Repository.CompteRepository;
import com.example.demo.Repository.EntrepriseRepository;
import com.example.demo.Service.EntrepriseService;
import com.example.demo.Util.SendMail;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class EntrepriseImpl implements EntrepriseService{

    @Autowired
    private EntrepriseRepository entrepriseRepository;
    @Autowired
    private CompteRepository compteRepository;

    @Autowired
    private SendMail sendMail;

    Random random = new Random();



    @Override
    @Transactional
    public Entreprise ajouterEntreprise(Entreprise entreprise) {
        Professionelle compte = new Professionelle();
        compte.setCreation_date(new Date());
        compte.setSolde(0l);
        Long x = random.nextLong();
        compte.setNum_compte(x);
        compte.setEntreprise(entreprise);
        compte.setLibellé(1234l);
        compte.setTaux_interet(20);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String password = generateRandomPassword(10);
        entreprise.setPassword(encoder.encode(password));

        System.out.println("sending start........");


        String text = "Hello, \n\n this is your  password you can change it after logging : \n\n\t" +
                                         password +
               " \n\n and this is your account number  : \n\n\t"+
                compte.getNum_compte()+"\n\n"+
             "\n\n Welcome with us Thank You. \n" +
                                        "\n\n contact.bank";
        String subject = "Entreprise Password";
        SimpleMailMessage message = new SimpleMailMessage();
        sendMail.Sendmail(entreprise.getEmail(),text,subject);

        compteRepository.save(compte);
        return entrepriseRepository.save(entreprise);

    }

    private static String generateRandomPassword(int len) {
        return RandomStringUtils.randomAlphanumeric(len);
    }


    @Override
    public List<Entreprise> getAllEntreprise() {
        return entrepriseRepository.findAll();
        //return entrepriseRepository.findAll().stream().map(EntrepriseDto::fromEntity).collect(Collectors.toList());
    }

    @Override
    public Optional<Entreprise> GetEntrepriseById(Long Entreprise_Id) {
        return entrepriseRepository.findById(Entreprise_Id);
    }

    @Override
    public Optional<Entreprise> GetEntrepriseByName(String ent_Name) {
        return Optional.empty();
    }

    @Override
    public Optional<Entreprise> GetEntrepriseByImmatricule(int Immatricule) {
        return Optional.empty();
    }

    @Override
    public void DeleteById(Long id) {
        entrepriseRepository.deleteById(id);
    }

    @Override
    public Entreprise modifierPassword(String password) {
        Entreprise entreprise = entrepriseRepository.findBypassword(password);
        return null;
    }


}
