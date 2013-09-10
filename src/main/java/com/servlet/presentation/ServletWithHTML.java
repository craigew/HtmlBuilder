package com.servlet.presentation;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletWithHTML extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html> ");
        out.println("<head>");
        out.println("<title>An example using a builder pattern to make the servlet code prettier</title>");
        out.println("<link rel=\"stylesheet\" href=\"css\\reset.css\">");
        out.println("<link rel=\"stylesheet\" href=\"css\\style.css\">");
        out.println("</head> ");

        out.println("<body>");

        out.println("<form>");

        out.println("<div class=\"title\">Builder pattern to make servlet html creation easier to read</div> ");

        out.println("<div class=\"paragraph\">An example using a builder pattern to make the servlet code prettier</div>");

        out.println("<dl>");

        out.println("<dt class=\"twocolumn\"><label>");
        out.println("Label text 1");
        out.println("</label></dt>");
        out.println("<dd class=\"twocolumn\"><p>");
        out.println("Value text 1");
        out.println("</p></dd>");

        out.println("<dt class=\"twocolumn\"><label>");
        out.println("Label text 2");
        out.println("</label></dt>");
        out.println("<dd class=\"twocolumn\"><p>");
        out.println("Value text 2");
        out.println("</p></dd>");

        out.println("<dt class=\"twocolumn\"><label>");
        out.println("Label text 3");
        out.println("</label></dt>");
        out.println("<dd class=\"twocolumn\"><p>");
        out.println("Value text 3");
        out.println("</p></dd>");

        out.println("<dt class=\"twocolumn\"><label>");
        out.println("Label text 4");
        out.println("</label></dt>");
        out.println("<dd class=\"twocolumn\"><p>");
        out.println("Value text 4");
        out.println("</p></dd>");

        out.println("</dl>");

        out.println("<div class=\"paragraph\">This is really hard to read</div>");

        out.println("</form>");

        out.println("</body>");
        out.println("</html>");
    }
}
