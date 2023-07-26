package controller;

import implementacion.UsuarioDAOImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import models.Usuario;

import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class Inicio
 */
@WebServlet(name = "Login", value = "/Login")
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    UsuarioDAOImpl usuarioDAO = new UsuarioDAOImpl();

    private HttpSession session;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("Login.jsp").forward(request, response);

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub

        session = request.getSession();
        String nombre = request.getParameter("nombre");
        String pass = request.getParameter("pass");


        List<Usuario> listaUsuarios = usuarioDAO.listarUsuario();


        Usuario usuarioAutenticado = null;
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getNombre().equals(nombre) && usuario.getContrasenia().equals(pass)) {
                usuarioAutenticado = usuario;
                break;
            }
        }

        if ((nombre.equals("admin") && pass.equals("1234")) || (usuarioAutenticado != null && nombre.equals(usuarioAutenticado.getNombre()) && pass.equals(usuarioAutenticado.getContrasenia()))) {

            session.setAttribute("nombre", nombre);
            session.setAttribute("pass", pass);

            request.getRequestDispatcher("Contacto.jsp").forward(request, response);
        }else{
            request.getRequestDispatcher("Login.jsp").forward(request, response);
        }

    }

}