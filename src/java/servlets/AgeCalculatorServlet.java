package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Trevor-Erixon
 */
public class AgeCalculatorServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String age = request.getParameter("age");
        
        request.setAttribute("age", age);
        
        if (age == null || age.equals(""))
        {
            request.setAttribute("message", "You must give your current age.");
            
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
            
            return;
        }
        
        try
        {
            int ageInt = Integer.parseInt(age);
            
            ageInt++;
            
            request.setAttribute("message", "Your age next birthday will be " + ageInt);
            
        }
        catch (NumberFormatException e)
        {
            request.setAttribute("message", "You must enter a number.");
            
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
            
            return;
        }
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
    }
    
}
