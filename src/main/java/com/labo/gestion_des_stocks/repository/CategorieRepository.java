package com.labo.gestion_des_stocks.repository;

import com.labo.gestion_des_stocks.entity.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie,Long> {
}
