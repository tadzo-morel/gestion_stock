package com.labo.gestion_des_stocks.repository;

import com.labo.gestion_des_stocks.entity.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepository extends JpaRepository<Facture,Long> {
}
