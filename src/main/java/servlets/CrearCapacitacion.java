package servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Capacitacion;
import models.Contenedor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class CrearCapacitacion
 */
@WebServlet(name = "CrearCapacitacion", value = "/CrearCapacitacion")
public class CrearCapacitacion extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private Contenedor contenedor;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearCapacitacion() {
        super();
        this.contenedor = new Contenedor();
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
        Capacitacion capacitacion = new Capacitacion(
                request.getParameter("rutCliente"),
                request.getParameter("dia"),
                request.getParameter("hora"),
                request.getParameter("lugar"),
                request.getParameter("duracion"),
                Integer.parseInt(request.getParameter("cantAsistentes")));

                contenedor.agregarCapacitacion(capacitacion);


        request.setAttribute("listaCapacitaciones", contenedor.getCapacitaciones());

        request.getRequestDispatcher("ListadoCapacitaciones.jsp").forward(request, response);

    }

}
