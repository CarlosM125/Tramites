package com.example.Tramites.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Tramites.model.Tramite;
import com.example.Tramites.repository.TramiteRepository;

@Service
public class TramiteService {
  @Autowired
  private TramiteRepository repository;

  public List<Tramite> listarTramite(){
    return repository.findAll();
  }
  public Tramite guardarTramite(Tramite tramite){
    return repository.save(tramite);
  }
  public void actualizarTramite(Tramite tramite){
    
  } 
  public void borrarTramite(String id){
    repository.deleteById(id);
  }

}
