package controller;

import model.TemperatureConverter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cConvertServlet")
public class CelsiusToFahrenheitServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 4072490465731754766L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String celsiusStr = request.getParameter("celsius");
        double celsius = Double.parseDouble(celsiusStr);

        double fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);

        request.setAttribute("result", fahrenheit);
        request.getRequestDispatcher("/results.jsp").forward(request, response);
    }
}
