package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Compte_Bancaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long compte_id;

    @ManyToOne
    private Entreprise entreprise;

    private Long num_compte;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date creation_date;

    private Long solde;


}
