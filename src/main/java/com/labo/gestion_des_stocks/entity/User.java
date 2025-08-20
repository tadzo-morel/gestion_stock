package com.labo.gestion_des_stocks.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String nom;
    private String email;
    private Long telephone;
    private  String password;

    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY)
    private Set<Commande> commandes;
}
