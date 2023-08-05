package com.example.demo;

import com.example.demo.dao.CapacitacionDAO;
import com.example.demo.models.Capacitacion;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Grupal3M6Application {

	public static void main(String[] args) {

		CapacitacionDAO capacitacionDAO = new CapacitacionDAO();

		Capacitacion capacitacion1 = new Capacitacion("159998881", "Lunes", "12:00", "Los Angeles", "10", "10");
		Capacitacion capacitacion2 = new Capacitacion("167768992", "Jueves", "9:00", "Los Andes", "7", "17");
		Capacitacion capacitacion3 = new Capacitacion("127568292", "Domingo", "10:00", "Santiago", "4", "8");
		capacitacionDAO.obtenerCapacitacion().add(capacitacion1);
		capacitacionDAO.obtenerCapacitacion().add(capacitacion2);
		capacitacionDAO.obtenerCapacitacion().add(capacitacion3);
		SpringApplication.run(Grupal3M6Application.class, args);
	}

}
