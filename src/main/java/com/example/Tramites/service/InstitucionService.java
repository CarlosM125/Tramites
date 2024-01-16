package com.example.Tramites.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Tramites.model.Institucion;
import com.example.Tramites.repository.InstitucionRepository;

@Service
public class InstitucionService {

  @Autowired
  private InstitucionRepository repository;

  public List<Institucion> listarInstitucion(){
    return repository.findAll();
  }
  public Institucion guardarInstitucion(Institucion institucion){
    return repository.save(institucion);
  } 
  public void actualizarInstitucion(Institucion institucion){
    
  } 
  public void borrarInstitucion(String id){
    repository.deleteById(id);
  }
}
