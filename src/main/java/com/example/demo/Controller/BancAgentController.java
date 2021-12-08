package com.example.demo.Controller;

import com.example.demo.Model.Bank_Agent;
import com.example.demo.Repository.BankAgentRepository;
import com.example.demo.Service.ServiceImpl.Bank_AgentImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/banque")
@Api("/banque")
public class BancAgentController {

    @Autowired
    private Bank_AgentImpl bankAgent;

    @GetMapping("/all")
    @ApiOperation(value = "Rechercher tous les agents bancaires",notes = "voir les agent du banque avec leur donnée",response = Bank_Agent.class)
    @ApiResponses(value = {
            @ApiResponse(code= 200,message = "les agent ont ete trouvée dans la BDD"),
            @ApiResponse(code=404,message ="Aucun agent trouvée dans la BDD")
    })
    public List<Bank_Agent> getAllBankAgent(){
        return bankAgent.GetAllAgent();
    }

    @PostMapping("/signup")
    @ApiOperation(value = "ajouter un agent comme un admin pour l'application de la banque",notes = "enregistrer un agent bancaire comme un admin qui toute les fonctionnalitée de l'admin et ses authorizations",response = Bank_Agent.class)
    @ApiResponses(value = {
            @ApiResponse(code= 200,message = "l'agent a ete crée avec sucsée dans la BDD"),
            @ApiResponse(code=40,message ="L'objet n'est pas valid on n'est peux pas l'enregistrer")
    })
    public Bank_Agent signUp(@RequestBody Bank_Agent agent){
        return bankAgent.SignUp(agent);
    }

    @PostMapping("/login")
    @ApiOperation(value = "identifier l'admin de l'application bancaire",notes = "identifier l'agent pour acceder a son interface administrative",response = String.class)
    @ApiResponses(value = {
            @ApiResponse(code= 200,message = "l'agent a ete crée avec sucsée dans la BDD"),
            @ApiResponse(code=40,message ="L'objet n'est pas valid on n'est peux pas l'enregistrer")
    })
    public String Login(@RequestBody Bank_Agent agent){
        return bankAgent.Login(agent);
    }
    

}
