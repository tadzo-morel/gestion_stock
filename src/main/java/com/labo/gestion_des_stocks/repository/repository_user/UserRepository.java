package com.labo.gestion_des_stocks.repository.repository_user;

import com.labo.gestion_des_stocks.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{
}