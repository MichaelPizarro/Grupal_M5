package dao;

import conexion.Conexion;
import idao.ICapacitacion;
import models.Capacitacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CapacitacionDAOImpl implements ICapacitacion {

    @Override
    public boolean guardarCapacitacion(Capacitacion capacitacion) {
        boolean registrar = false;
        Statement stm = null;
        Connection conn = null;

        String sql = "INSERT INTO capacitaciones (rut_cliente,dia,hora,lugar,duracion,cant_asistentes) values ('"+
                      capacitacion.getRutCliente()+"','"+capacitacion.getDia()+"','"+capacitacion.getHora()+"','"+
                      capacitacion.getLugar()+"','"+capacitacion.getDuracion()+"',"+capacitacion.getCantAsistentes()+")";
        try{
            conn = Conexion.getConnection();
            stm = conn.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            conn.close();
        }catch (SQLException e){
            System.out.println("Error : clase CapacitacionDAOImpl en el método guardarCapacitacion");
            e.printStackTrace();
        }
        return registrar;
    }

    @Override
    public List<Capacitacion> listarCapacitacion() {
        Statement stm = null;
        Connection conn = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM capacitaciones ORDER BY id";

        List<Capacitacion> listaCapacitaciones = new ArrayList<>();

        try{
            conn = Conexion.getConnection();
            stm = conn.createStatement();
            rs  = stm.executeQuery(sql);

            while(rs.next()){
                Capacitacion capacitacion = new Capacitacion();

                capacitacion.setIdentificador(rs.getInt(1));
                capacitacion.setRutCliente(rs.getString(2));
                capacitacion.setDia(rs.getString(3));
                capacitacion.setHora(rs.getString(4));
                capacitacion.setLugar(rs.getString(5));
                capacitacion.setDuracion(rs.getString(6));
                capacitacion.setCantAsistentes(rs.getInt(7));

                listaCapacitaciones.add(capacitacion);
            }

            rs.close();
            stm.close();
            conn.close();

        }catch (SQLException e){
            System.out.println("Error : clase CapacitacionDAOImpl en el método listarCapacitacion");
            e.printStackTrace();
        }

        return listaCapacitaciones;
    }
}
