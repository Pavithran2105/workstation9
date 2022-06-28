package com.example.demo.repoBud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelBud.Modelbud;

@Repository
public interface RepoBud extends JpaRepository<Modelbud, Long>{
    
}