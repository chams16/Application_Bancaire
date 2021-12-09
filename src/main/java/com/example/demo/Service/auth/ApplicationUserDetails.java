package com.example.demo.Service.auth;

import com.example.demo.Exception.EntityNotFoundException;
import com.example.demo.Model.Bank_Agent;
import com.example.demo.Repository.BankAgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class ApplicationUserDetails implements UserDetailsService {

    @Autowired
    private BankAgentRepository bankAgentRepository;


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        //return userRepository.findByEmail(email);

        Bank_Agent admin = bankAgentRepository.findByEmail(email).orElseThrow(()->
                new EntityNotFoundException("User not found with email fournie")
                );
        return new User(admin.getName(),admin.getPassword(), Collections.EMPTY_LIST);
    }
}
