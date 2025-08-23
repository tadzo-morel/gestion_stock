package com.labo.gestion_des_stocks.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "Personne",length = 8)
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private  String nom;
    private String email;
    private String telephone;
    private  String password;

    @OneToMany(mappedBy = "user",fetch = FetchType.EAGER)
    private List<Commande> commandes=new ArrayList<Commande>();
}
