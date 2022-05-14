package com.app.crud.controlador;

import com.app.crud.entidad.Servicio;
import com.app.crud.servicio.ServicioServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ServicioControlador {

    @Autowired
    private ServicioServicio servicioServicio;

    @GetMapping({ "/servicios", "/" })
    public String listarServicios(Model modelo) {
        modelo.addAttribute("servicios", servicioServicio.listarServicios());
        return "Servicios";
    }

    @GetMapping("/servicios/nuevo")
    public String crearServicioFormulario(Model modelo) {
        Servicio servicio = new Servicio();
        modelo.addAttribute("servicio", servicio);
        return "CrearServicio";
    }

    @PostMapping("/agregarServicio")
    public String guardarServicio(@ModelAttribute("servicio") Servicio servicio) {
        servicioServicio.guardarServicio(servicio);
        return "redirect:/servicios";
    }

    @GetMapping("/servicios/editar")
    public String editarServicio(@PathVariable Long id, Model modelo) {
        modelo.addAttribute("servicio", servicioServicio.obtenerUno(id));
        return "EditarServicio";
    }

    @PostMapping("/servicios/{id}")
    public String actualizarServicio(@PathVariable Long id, @ModelAttribute("servicio") Servicio servicio,
            Model modelo) {
        Servicio servicioExistente = servicioServicio.obtenerUno(id);
        servicioExistente.setId(id);
        servicioExistente.setDescripcion(servicio.getDescripcion());
        servicioExistente.setNombreCliente(servicio.getNombreCliente());
        servicioExistente.setDireccion(servicio.getDireccion());
        servicioExistente.setTelefonoContacto(servicio.getTelefonoContacto());

        servicioServicio.actualizarServicio(servicioExistente);
        return "redirect:/servicios";
    }

    @GetMapping("/servicios/{id}")
    public String eliminarServicio(@PathVariable Long id) {
        servicioServicio.eliminarServicio(id);
        return "redirect:/servicios";
    }

}
