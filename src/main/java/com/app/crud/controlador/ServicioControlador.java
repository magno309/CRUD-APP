package com.app.crud.controlador;

import com.app.crud.entidad.Servicio;
import com.app.crud.servicio.ServicioServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServicioControlador {
    
    @Autowired
    private ServicioServicio servicioServicio;

    @GetMapping({"/servicios", "/"})
    public String listarServicios(Model modelo) {
        modelo.addAttribute("servicios", servicioServicio.listarServicios());
        return "Servicios";
    }

    @GetMapping("/servicios/nuevo")
    public String crearServicioFormulario(Model modelo){
        Servicio servicio = new Servicio();
        modelo.addAttribute("servicio", servicio);
        return "CrearServicio";
    }

}
