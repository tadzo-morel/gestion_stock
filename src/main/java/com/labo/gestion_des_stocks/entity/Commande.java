package com.labo.gestion_des_stocks.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_commande;

    @OneToOne(mappedBy = "commande",fetch = FetchType.LAZY)
    private Facture facture;
    private String numeroCommande;

    @ManyToMany
    @JoinColumn(name = "id_user")
    private User user;


}
