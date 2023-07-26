package controller;

import implementacion.CapacitacionDAOImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Capacitacion;

import java.io.IOException;

/**
 * Servlet implementation class CrearCapacitacion
 */
@WebServlet(name = "CrearCapacitacion", value = "/CrearCapacitacion")
public class CrearCapacitacion extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private CapacitacionDAOImpl capacitacionDAO = new CapacitacionDAOImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearCapacitacion() {

    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("CrearCapacitacion.jsp").forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Capacitacion capacitacion = new Capacitacion(
                request.getParameter("rutCliente"),
                request.getParameter("dia"),
                request.getParameter("hora"),
                request.getParameter("lugar"),
                request.getParameter("duracion"),
                Integer.parseInt(request.getParameter("cantAsistentes")));


        if(capacitacionDAO.guardarCapacitacion(capacitacion)){
            System.out.println("Capacitación registrada");
        }

        request.getRequestDispatcher("CrearCapacitacion.jsp").forward(request,response);

    }

}
