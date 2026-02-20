package org.jboss.intersmash.applications;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.logging.Logger;

public class SimpleServlet extends HttpServlet {

    private Logger logger = Logger.getLogger(SimpleServlet.class.getName());

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        logger.info("SimpleServlet.doGet()");
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("OK!!!!");
        out.println("</html>");
        out.close();  // Always close the output writer
    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        logger.info("SimpleServlet.doPost()");
        doGet(request, response);
    }
}
