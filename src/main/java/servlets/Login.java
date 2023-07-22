package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class Inicio
 */
@WebServlet(name = "Login", value = "/Login")
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;

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
        // TODO Auto-generated method stub


    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        session = request.getSession();
        String usuario = request.getParameter("usuario");
        String pass = request.getParameter("pass");

        if(usuario.equals("admin") && pass.equals("1234")){
            session.setAttribute("usuario", usuario);
            session.setAttribute("pass",pass);

            request.getRequestDispatcher("Contacto.jsp").forward(request, response);
        }else{

            request.getRequestDispatcher("Login.jsp").forward(request, response);
        }
    }

}