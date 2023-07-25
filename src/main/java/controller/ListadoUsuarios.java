package controller;

import dao.CapacitacionDAOImpl;
import dao.UsuarioDAOImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Capacitacion;
import models.Usuario;


import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class ListadoUsuarios
 */
@WebServlet(name = "ListadoUsuarios", value = "/ListadoUsuarios")
public class ListadoUsuarios extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private UsuarioDAOImpl usuarioDAO = new UsuarioDAOImpl();

    //private UsuarioDAOImpl usuarioDAO = new UsuarioDAOImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListadoUsuarios() {
        super();

    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Usuario> listaUsuarios = usuarioDAO.listarUsuario();

        if(!listaUsuarios.isEmpty()){
            System.out.println("Usuarios listadas");
            request.setAttribute("listaUsuarios",listaUsuarios);
            request.getRequestDispatcher("ListadoUsuarios.jsp").forward(request,response);
        }

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
