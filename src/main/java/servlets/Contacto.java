package servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Contacto
 */

@WebServlet(name = "Contacto", value = "/Contacto")
public class Contacto extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contacto() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        //response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        //doGet(request, response);

        request.setAttribute("nombreSalida", request.getParameter("nombre"));
        request.setAttribute("correoSalida", request.getParameter("correo"));
        request.setAttribute("comentarioSalida", request.getParameter("comentario"));

        System.out.println(request.getParameter("nombre"));
        System.out.println(request.getParameter("correo"));
        System.out.println(request.getParameter("comentario"));

        request.getRequestDispatcher("Contacto.jsp").forward(request, response);

    }

}
