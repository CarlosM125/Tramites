package com.example.Tramites.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Tramites.model.Tramite;

import java.util.List;

public interface TramiteRepository extends JpaRepository <Tramite, String>{
  
}
