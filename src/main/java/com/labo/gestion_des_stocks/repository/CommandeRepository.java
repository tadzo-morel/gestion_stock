package com.labo.gestion_des_stocks.repository;

import com.labo.gestion_des_stocks.entity.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande,Long> {
}
