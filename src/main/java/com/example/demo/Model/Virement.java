package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data

@Entity
public class Virement extends Transaction {


    //to do
    /*
    faire le virement d'un montant monnai d'un compte a un autre
    compte 1 ======> compte 2
    solde du compte1 >=  montant qu'on veut l'envoyer
    sinon si le compte entre dans le rouge une alerte sera envoyée et affichée a l'entreprise
    le propririetaire du compte 1 initier le transfert
    l'agent bancaire valide cette transfert

    on peut faire le virement entre deux compte de la meme entreprise

     */
}
