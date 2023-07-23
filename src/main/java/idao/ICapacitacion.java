package idao;

import models.Capacitacion;

import java.util.List;

public interface ICapacitacion {

    public boolean guardarCapacitacion(Capacitacion capacitacion);
    public List<Capacitacion> listarCapacitacion();
}
