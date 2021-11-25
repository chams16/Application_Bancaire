package com.example.demo.Service;

import com.example.demo.Model.Bank_Agent;
import com.example.demo.Repository.BankAgentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public interface Bank_AgentService {

    Bank_Agent SignUp(Bank_Agent bankAgent);
    Bank_Agent Login(Bank_Agent bankAgent);

    List<Bank_Agent> GetAllAgent();


}
