package com.app.crud;

import com.app.crud.entidad.Servicio;
import com.app.crud.repositorio.ServicioRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	@Autowired
	private ServicioRepositorio repositorio;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Servicio servicio1 = new Servicio("nombreCliente1", "descripcion1", "1234567890", "direccion1", true);
		repositorio.save(servicio1);
		Servicio servicio2 = new Servicio("nombreCliente2", "descripcion2", "1234567890", "direccion2", false);
		repositorio.save(servicio2);
		Servicio servicio3 = new Servicio("nombreCliente3", "descripcion3", "1234567890", "direccion3", true);
		repositorio.save(servicio3);
	}

}
