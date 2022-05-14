package com.app.crud.servicio;

import java.util.List;

import com.app.crud.entidad.Servicio;

public interface ServicioServicio {
    public List<Servicio> listarServicios();

    public Servicio guardarServicio(Servicio servicio);

    public Servicio obtenerUno(Long id);

    public Servicio actualizarServicio(Servicio servicio);

    public void eliminarServicio(Long id);
}
