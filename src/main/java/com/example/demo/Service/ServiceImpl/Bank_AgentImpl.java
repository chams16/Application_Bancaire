package com.example.demo.Service.ServiceImpl;

import com.example.demo.Model.Bank_Agent;
import com.example.demo.Repository.BankAgentRepository;
import com.example.demo.Service.Bank_AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Bank_AgentImpl implements Bank_AgentService {

    @Autowired
    private BankAgentRepository bankAgentRepository;


    @Override
    public Bank_Agent SignUp(Bank_Agent agent) {
        return bankAgentRepository.save(agent);
    }

    @Override
    public String Login(Bank_Agent bankAgent) {
            String result = "en attend le reglage du spring security pour faire le login et sign up";
        return result;
    }

    @Override
    public List<Bank_Agent> GetAllAgent() {
        return bankAgentRepository.findAll();
    }
}
