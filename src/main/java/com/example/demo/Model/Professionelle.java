package com.example.demo.Model;

import lombok.*;

import javax.persistence.Entity;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Professionelle extends Compte_Bancaire{

    private Long Libellé;
    private int Taux_interet;

}
