package implementacion;

import conexion.Conexion;
import interfaces.IUsuario;
import models.TipoUsuario;
import models.Usuario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAOImpl implements IUsuario {
    @Override
    public boolean guardarUsuario(Usuario usuario) {
        boolean registrar = false;
        Statement stm = null;
        Connection conn = null;

        String sql = "INSERT INTO usuarios(nombre,contrasenia,tipo) values ('"+
                usuario.getNombre()+"','"+usuario.getContrasenia()+"','"+usuario.getTipo()+ "')";
        try{
            conn = Conexion.getConnection();
            stm = conn.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            conn.close();
        }catch (SQLException e){
            System.out.println("Error : clase UsuarioDAOImpl en el método guardarUsuario");
            e.printStackTrace();
        }
        return registrar;
    }

    @Override
    public List<Usuario> listarUsuario() {
        Statement stm = null;
        Connection conn = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM usuarios ORDER BY id";

        List<Usuario> listaUsuarios = new ArrayList<>();

        try{
            conn = Conexion.getConnection();
            stm = conn.createStatement();
            rs  = stm.executeQuery(sql);

            while(rs.next()){
                Usuario usuario = new Usuario();

                usuario.setId(rs.getInt(1));
                usuario.setNombre(rs.getString(2));
                usuario.setContrasenia(rs.getString(3));
                usuario.setTipo(TipoUsuario.valueOf(rs.getString(4)));

                listaUsuarios.add(usuario);
            }

            rs.close();
            stm.close();
            conn.close();

        }catch (SQLException e){
            System.out.println("Error : clase UsuarioDAOImpl en el método listarUsuario");
            e.printStackTrace();
        }

        return listaUsuarios;
    }
}
