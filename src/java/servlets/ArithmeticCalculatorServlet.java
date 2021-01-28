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
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {       
        request.setAttribute("calc", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String firstInt = request.getParameter("firstInt");
        String secondInt = request.getParameter("secondInt");
        String inputType = request.getParameter("inputType");

        request.setAttribute("firstInt", firstInt);
        request.setAttribute("secondInt", secondInt);
        
        if (firstInt == null || firstInt.equals("") || secondInt == null || secondInt.equals(""))
        {
            request.setAttribute("calc", "Invalid");            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            return;
        }
        
        try
        {
            int firstInteger = Integer.parseInt(firstInt);
            int secondInteger = Integer.parseInt(secondInt);
            int arithmetic = 0;
            
            if (inputType.equals("+"))
            {
                arithmetic = firstInteger + secondInteger;
            }
            else if (inputType.equals("-"))
            {
                arithmetic = firstInteger - secondInteger;
            }
            else if (inputType.equals("*"))
            {
                arithmetic = firstInteger * secondInteger;
            }
            else if (inputType.equals("%"))
            {
                arithmetic = firstInteger % secondInteger;
            }
            
            request.setAttribute("calc", arithmetic);

        }
        catch (NumberFormatException e)
        {
            request.setAttribute("calc", "Invalid");
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }

}
