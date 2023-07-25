package idao;

import models.Usuario;

import java.util.List;

public interface IUsuario {

    public boolean guardarUsuario(Usuario usuario);
    public List<Usuario> listarUsuario();
}