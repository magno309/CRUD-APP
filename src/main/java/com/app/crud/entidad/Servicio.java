package com.app.crud.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "servicios")
public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombreCliente", nullable = false, length = 50)
    private String nombreCliente;

    @Column(name = "descripcion", nullable = false, length = 255)
    private String descripcion;

    @Column(name = "telefonoContacto", nullable = false, length = 10)
    private String telefonoContacto;

    @Column(name = "direccion", nullable = false, length = 50)
    private String direccion;

    @Column(name = "compleado", nullable = false)
    private boolean compleado;

    public Servicio() {
    }

    public Servicio(Long id, String nombreCliente, String descripcion, String telefonoContacto, String direccion,
            boolean compleado) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.descripcion = descripcion;
        this.telefonoContacto = telefonoContacto;
        this.direccion = direccion;
        this.compleado = compleado;
    }

    public Servicio(String nombreCliente, String descripcion, String telefonoContacto, String direccion,
            boolean compleado) {
        this.nombreCliente = nombreCliente;
        this.descripcion = descripcion;
        this.telefonoContacto = telefonoContacto;
        this.direccion = direccion;
        this.compleado = compleado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isCompleado() {
        return compleado;
    }

    public void setCompleado(boolean compleado) {
        this.compleado = compleado;
    }

}
