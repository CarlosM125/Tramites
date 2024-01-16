package com.example.Tramites.model;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Institucion {
  @Id
    private String id;
    private String institucion;
    private String siglas;
    private String logo;
    private String website;
    private String descripcion;
    private String sector;
    private Date modificado;
    private String publicado;
    
    public Institucion(String id, String institucion, String siglas, String logo, String website, String descripcion,
        String sector, Date modificado, String publicado) {
      this.id = id;
      this.institucion = institucion;
      this.siglas = siglas;
      this.logo = logo;
      this.website = website;
      this.descripcion = descripcion;
      this.sector = sector;
      this.modificado = modificado;
      this.publicado = publicado;
    }
    
    public String getId() {
      return id;
    }

    public void setId(String id) {
      this.id = id;
    }

    public String getInstitucion() {
      return institucion;
    }

    public void setInstitucion(String institucion) {
      this.institucion = institucion;
    }

    public String getSiglas() {
      return siglas;
    }

    public void setSiglas(String siglas) {
      this.siglas = siglas;
    }

    public String getLogo() {
      return logo;
    }

    public void setLogo(String logo) {
      this.logo = logo;
    }

    public String getWebsite() {
      return website;
    }

    public void setWebsite(String website) {
      this.website = website;
    }

    public String getDescripcion() {
      return descripcion;
    }

    public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
    }

    public String getSector() {
      return sector;
    }

    public void setSector(String sector) {
      this.sector = sector;
    }

    public Date getModificado() {
      return modificado;
    }

    public void setModificado(Date modificado) {
      this.modificado = modificado;
    }

    public String getPublicado() {
      return publicado;
    }

    public void setPublicado(String publicado) {
      this.publicado = publicado;
    }

    
  
}
