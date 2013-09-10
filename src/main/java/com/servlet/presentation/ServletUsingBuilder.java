package com.servlet.presentation;

import com.servlet.builder.FormBuilder;
import com.servlet.builder.TwoColumnTable;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletUsingBuilder extends HttpServlet {

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

        new FormBuilder()
                .title("Builder pattern to make servlet html creation easier to read")
                .paragraph("An example using a builder pattern to make the servlet code prettier")
                .twoColumnTable(new TwoColumnTable()
                        .row("Label text 1", "Value text 1")
                        .row("Label text 2", "Value text 2")
                        .row("Label text 3", "Value text 3")
                        .row("Label text 4", "Value text 4"))
                .paragraph("This is really much easier to read")
                .toString(out);


        out.println("</body>");
        out.println("</html>");
    }
}
