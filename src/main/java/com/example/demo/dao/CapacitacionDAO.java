package com.example.demo.dao;

import com.example.demo.models.Capacitacion;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
public class CapacitacionDAO implements ICapacitacionDAO {

    private static final Logger logger = LoggerFactory.getLogger(CapacitacionDAO.class);

    private static List<Capacitacion> listaCapacitaciones = new ArrayList<>();
    @Override
    public List<Capacitacion> obtenerCapacitacion() {
        logger.info("Capacitacion listada");
        return listaCapacitaciones;
    }

    @Override
    public boolean crearCapacitacion(Capacitacion capacitacion) {
    boolean registrar = false;
    if (capacitacion!= null) {
        listaCapacitaciones.add(capacitacion);
        logger.info("Su capacitacion ha sido agregada en la funcion CrearCapacitacion");
        registrar=true;
    }
    return registrar;

    }
}
