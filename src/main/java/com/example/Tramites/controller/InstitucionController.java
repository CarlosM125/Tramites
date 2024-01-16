package com.example.Tramites.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.Tramites.model.Institucion;
import com.example.Tramites.service.InstitucionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/api/v2")
public class InstitucionController {
  @Autowired
  private InstitucionService institucionService;

  @GetMapping("/institucion")
  public List<Institucion> listarInstitucion() {
    return institucionService.listarInstitucion();
  }

    @PostMapping("/profesor")
  public Institucion guardarInstitucion(@RequestBody Institucion institucion) {
    return institucionService.guardarInstitucion(institucion);
  }

  @DeleteMapping("/institucion/{id}") 
  public void eliminarInstitucion(@PathVariable String id){
    institucionService.borrarInstitucion(id);
  }

  @PutMapping("/institucion/{id}")
  public void actualizarInstitucion(@PathVariable String id, @RequestBody Institucion institucion){
    institucionService.actualizarInstitucion(institucion);
  }

  
}
