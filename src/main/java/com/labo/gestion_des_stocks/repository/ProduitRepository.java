package com.labo.gestion_des_stocks.repository;

import com.labo.gestion_des_stocks.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
