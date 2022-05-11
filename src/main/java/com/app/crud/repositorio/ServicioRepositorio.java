package com.app.crud.repositorio;

import com.app.crud.entidad.Servicio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicioRepositorio extends JpaRepository<Servicio, Long>{
    
    
}
