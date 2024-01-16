package com.example.Tramites.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Tramites.model.Institucion;

import java.util.List;

@Repository
public interface InstitucionRepository extends JpaRepository <Institucion, String> {

}
