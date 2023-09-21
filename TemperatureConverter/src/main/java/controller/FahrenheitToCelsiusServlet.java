package controller;

import model.TemperatureConverter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/fConvertServlet")
public class FahrenheitToCelsiusServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 5848163489408181142L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String temperatureStr = request.getParameter("fahrenheit");
		double temperature = Double.parseDouble(temperatureStr);


        double result = TemperatureConverter.fahrenheitToCelsius(temperature);

        request.setAttribute("result", result);
        request.getRequestDispatcher("/results.jsp").forward(request, response);
    }
}
