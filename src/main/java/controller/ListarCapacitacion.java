package controller;

import implementacion.CapacitacionDAOImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Capacitacion;

import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class ListarCapacitacion
 */
@WebServlet(name = "ListarCapacitacion", value = "/ListarCapacitacion")
public class ListarCapacitacion extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private CapacitacionDAOImpl capacitacionDAO = new CapacitacionDAOImpl();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarCapacitacion() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Capacitacion> listaCapacitaciones = capacitacionDAO.listarCapacitacion();

        if(!listaCapacitaciones.isEmpty()){
            System.out.println("Capacitaciones listadas");
            request.setAttribute("listaCapacitaciones",listaCapacitaciones);
            request.getRequestDispatcher("ListadoCapacitaciones.jsp").forward(request,response);
        }
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
