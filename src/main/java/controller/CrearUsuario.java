package controller;

import implementacion.UsuarioDAOImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.TipoUsuario;
import models.Usuario;

import java.io.IOException;

/**
 * Servlet implementation class CrearUsuario
 */
@WebServlet(name = "CrearUsuario", value = "/CrearUsuario")
public class CrearUsuario extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private UsuarioDAOImpl usuarioDAO = new UsuarioDAOImpl();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearUsuario() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("CrearUsuario.jsp").forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        TipoUsuario tipoUsuario = TipoUsuario.valueOf(request.getParameter("tipoUsuario"));
        Usuario usuario = new Usuario(request.getParameter("nombre"), request.getParameter("contrasenia"), tipoUsuario);

        if(usuarioDAO.guardarUsuario(usuario)){
            System.out.println("Usuario registrado");
        }

        request.getRequestDispatcher("CrearUsuario.jsp").forward(request,response);
    }

}
