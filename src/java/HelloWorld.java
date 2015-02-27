// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class HelloWorld extends HttpServlet {
 
  private String message;

  @Override
  public void init() throws ServletException{
      // Do required initialization
      message = "Hello World";
  }

  @Override
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException{
      // Set response content type
      response.setContentType("text/html");

      // Actual logic goes here.
      PrintWriter out = response.getWriter();
      out.println("<!DOCTYPE html>");
      out.println("<head><title>Hi</title></head>");
      out.println("<h1>" + message + "</h1>");
  }
  
  @Override
  public void destroy(){
      // do nothing.
  }
}