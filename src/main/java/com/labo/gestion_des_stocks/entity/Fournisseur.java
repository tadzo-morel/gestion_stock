package com.labo.gestion_des_stocks.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@DiscriminatorValue("fournisseur")
public class Fournisseur extends User {

    private String reference;

    @Column(name = "immatriculation",nullable = false)
    private String immatriculation;
    @ManyToMany(fetch =FetchType.EAGER )
    @JoinTable(name="produitFournisseur")
    List<Produit> produits=new ArrayList<Produit>();
}
