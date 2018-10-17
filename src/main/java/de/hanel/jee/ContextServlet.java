package de.hanel.jee;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * java-servlet
 * Created by Daniel on 10/17/2018.
 */
@WebServlet(urlPatterns = "/context")
public class ContextServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        resp.setContentType(MediaType.TEXT_HTML);
        resp.setCharacterEncoding("utf-8");


        PrintWriter writer = resp.getWriter();
        writer.println("<html><head><title>Parameter Servlet</title><body><h1 style=\"color: blue;\">Parameter</h1></body></head></html>");

    }

}
