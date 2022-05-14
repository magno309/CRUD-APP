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

    @Override
    public Servicio guardarServicio(Servicio servicio) {
        return servicioRepositorio.save(servicio);
    }

    @Override
    public Servicio obtenerUno(Long id) {
        return servicioRepositorio.findById(id).get();
    }

    @Override
    public Servicio actualizarServicio(Servicio servicio) {
        return servicioRepositorio.save(servicio);
    }

    @Override
    public void eliminarServicio(Long id) {
        servicioRepositorio.deleteById(id);
    }
    
}
