package com.labo.gestion_des_stocks.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@Entity
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_categorie;

    @OneToMany(mappedBy = "categorie",fetch = FetchType.EAGER)
    private List<Produit> produits;
}
