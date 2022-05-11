package com.app.crud.servicio;

import java.util.List;

import com.app.crud.entidad.Servicio;
import com.app.crud.repositorio.ServicioRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioServicioImp implements ServicioServicio {

    @Autowired
    private ServicioRepositorio servicioRepositorio;

    @Override
    public List<Servicio> listarServicios() {
        return servicioRepositorio.findAll();
    }
    
}
