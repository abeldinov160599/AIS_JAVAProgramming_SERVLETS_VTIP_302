package AIS_SERVLETS;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Main extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        if (request.getParameter("calcSubmit") != null) {

            ResultForm obj = null;
            try {
                double a = Double.parseDouble(request.getParameter("a"));
                double b = Double.parseDouble(request.getParameter("b"));
                double x = Double.parseDouble(request.getParameter("c"));
                double d = 0;
                if (x < 7) {
                    d = (Math.pow(a, 2) - Math.pow(b, 2) - Math.pow(x, 2)) / (a + b);
                } else {
                    d = Math.pow(x, 3) - Math.pow((a + b), 2);
                }

                obj = new ResultForm();

                obj.setD(d);

                request.setAttribute("form", obj);
                getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
                return;
            } catch (Exception e) {
                getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
                return;
            }
        }

        getServletContext().getRequestDispatcher("/input.jsp").forward(request, response);
    }
}
