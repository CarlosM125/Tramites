package com.example.Tramites.model;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tramite {
  @Id
    private String id;
    private String codigo;
    private String nombre;
    private String institucion_id;
    private String imagen_url;
    private String descripcion;
    private String beneficiarios;
    private String requisitos_obligatorios;
    private String requisitos_especiales;
    private String procedimiento;
    private String tramite_enlinea_url;
    private String formularios;
    private String costo;
    private String costo_detalle;
    private String vigencia;
    private String vigencia_detalle;
    private String costo_requisitos_externo;
    private String tiempo_requisitos_externo;
    private String tiempo_atencion;
    private String horario;
    private String Direccion;
    private String contacto_nombre;
    private String contacto_telefono;
    private String contacto_correo;
    private Date modificado;
    public Tramite(String id, String codigo, String nombre, String institucion_id, String imagen_url,
        String descripcion, String beneficiarios, String requisitos_obligatorios, String requisitos_especiales,
        String procedimiento, String tramite_enlinea_url, String formularios, String costo, String costo_detalle,
        String vigencia, String vigencia_detalle, String costo_requisitos_externo, String tiempo_requisitos_externo,
        String tiempo_atencion, String horario, String direccion, String contacto_nombre, String contacto_telefono,
        String contacto_correo, Date modificado) {
      this.id = id;
      this.codigo = codigo;
      this.nombre = nombre;
      this.institucion_id = institucion_id;
      this.imagen_url = imagen_url;
      this.descripcion = descripcion;
      this.beneficiarios = beneficiarios;
      this.requisitos_obligatorios = requisitos_obligatorios;
      this.requisitos_especiales = requisitos_especiales;
      this.procedimiento = procedimiento;
      this.tramite_enlinea_url = tramite_enlinea_url;
      this.formularios = formularios;
      this.costo = costo;
      this.costo_detalle = costo_detalle;
      this.vigencia = vigencia;
      this.vigencia_detalle = vigencia_detalle;
      this.costo_requisitos_externo = costo_requisitos_externo;
      this.tiempo_requisitos_externo = tiempo_requisitos_externo;
      this.tiempo_atencion = tiempo_atencion;
      this.horario = horario;
      Direccion = direccion;
      this.contacto_nombre = contacto_nombre;
      this.contacto_telefono = contacto_telefono;
      this.contacto_correo = contacto_correo;
      this.modificado = modificado;
    }
    public String getId() {
      return id;
    }
    public void setId(String id) {
      this.id = id;
    }
    public String getCodigo() {
      return codigo;
    }
    public void setCodigo(String codigo) {
      this.codigo = codigo;
    }
    public String getNombre() {
      return nombre;
    }
    public void setNombre(String nombre) {
      this.nombre = nombre;
    }
    public String getInstitucion_id() {
      return institucion_id;
    }
    public void setInstitucion_id(String institucion_id) {
      this.institucion_id = institucion_id;
    }
    public String getImagen_url() {
      return imagen_url;
    }
    public void setImagen_url(String imagen_url) {
      this.imagen_url = imagen_url;
    }
    public String getDescripcion() {
      return descripcion;
    }
    public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
    }
    public String getBeneficiarios() {
      return beneficiarios;
    }
    public void setBeneficiarios(String beneficiarios) {
      this.beneficiarios = beneficiarios;
    }
    public String getRequisitos_obligatorios() {
      return requisitos_obligatorios;
    }
    public void setRequisitos_obligatorios(String requisitos_obligatorios) {
      this.requisitos_obligatorios = requisitos_obligatorios;
    }
    public String getRequisitos_especiales() {
      return requisitos_especiales;
    }
    public void setRequisitos_especiales(String requisitos_especiales) {
      this.requisitos_especiales = requisitos_especiales;
    }
    public String getProcedimiento() {
      return procedimiento;
    }
    public void setProcedimiento(String procedimiento) {
      this.procedimiento = procedimiento;
    }
    public String getTramite_enlinea_url() {
      return tramite_enlinea_url;
    }
    public void setTramite_enlinea_url(String tramite_enlinea_url) {
      this.tramite_enlinea_url = tramite_enlinea_url;
    }
    public String getFormularios() {
      return formularios;
    }
    public void setFormularios(String formularios) {
      this.formularios = formularios;
    }
    public String getCosto() {
      return costo;
    }
    public void setCosto(String costo) {
      this.costo = costo;
    }
    public String getCosto_detalle() {
      return costo_detalle;
    }
    public void setCosto_detalle(String costo_detalle) {
      this.costo_detalle = costo_detalle;
    }
    public String getVigencia() {
      return vigencia;
    }
    public void setVigencia(String vigencia) {
      this.vigencia = vigencia;
    }
    public String getVigencia_detalle() {
      return vigencia_detalle;
    }
    public void setVigencia_detalle(String vigencia_detalle) {
      this.vigencia_detalle = vigencia_detalle;
    }
    public String getCosto_requisitos_externo() {
      return costo_requisitos_externo;
    }
    public void setCosto_requisitos_externo(String costo_requisitos_externo) {
      this.costo_requisitos_externo = costo_requisitos_externo;
    }
    public String getTiempo_requisitos_externo() {
      return tiempo_requisitos_externo;
    }
    public void setTiempo_requisitos_externo(String tiempo_requisitos_externo) {
      this.tiempo_requisitos_externo = tiempo_requisitos_externo;
    }
    public String getTiempo_atencion() {
      return tiempo_atencion;
    }
    public void setTiempo_atencion(String tiempo_atencion) {
      this.tiempo_atencion = tiempo_atencion;
    }
    public String getHorario() {
      return horario;
    }
    public void setHorario(String horario) {
      this.horario = horario;
    }
    public String getDireccion() {
      return Direccion;
    }
    public void setDireccion(String direccion) {
      Direccion = direccion;
    }
    public String getContacto_nombre() {
      return contacto_nombre;
    }
    public void setContacto_nombre(String contacto_nombre) {
      this.contacto_nombre = contacto_nombre;
    }
    public String getContacto_telefono() {
      return contacto_telefono;
    }
    public void setContacto_telefono(String contacto_telefono) {
      this.contacto_telefono = contacto_telefono;
    }
    public String getContacto_correo() {
      return contacto_correo;
    }
    public void setContacto_correo(String contacto_correo) {
      this.contacto_correo = contacto_correo;
    }
    public Date getModificado() {
      return modificado;
    }
    public void setModificado(Date modificado) {
      this.modificado = modificado;
    }
    
  
}
