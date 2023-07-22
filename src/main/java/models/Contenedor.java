package models;

import java.util.ArrayList;
import java.util.List;

public class Contenedor {

  private List<Capacitacion> capacitaciones;

  public Contenedor(){
      this.capacitaciones = new ArrayList<>();
  }

  public void agregarCapacitacion(Capacitacion capacitacion){
      this.capacitaciones.add(capacitacion);
  }

    public List<Capacitacion> getCapacitaciones() {
        return capacitaciones;
    }
}
