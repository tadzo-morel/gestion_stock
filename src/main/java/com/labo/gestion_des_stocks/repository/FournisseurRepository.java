package com.labo.gestion_des_stocks.repository;

import com.labo.gestion_des_stocks.entity.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurRepository extends JpaRepository<Fournisseur,String> {
}
