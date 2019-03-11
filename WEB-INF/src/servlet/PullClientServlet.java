package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * PullClient
 */
public class PullClientServlet extends HttpServlet {
    private final static long serialVersionUID = 1L;

    private int count = 10;
 
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
        PrintWriter out = resp.getWriter();
        
        out.println(count);
        if(count > 0) {
            resp.setHeader("Refresh", "1");
            count--;
        } else {
            out.println("Fin");
        }

        out.close();
    }
}