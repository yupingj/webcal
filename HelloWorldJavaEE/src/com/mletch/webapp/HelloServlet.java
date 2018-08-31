package com.mletch.webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mletech.webapp.services.Calculator;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/nameServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Calculator cal=new Calculator();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String yourName = request.getParameter("yourLastName");
		PrintWriter writer = response.getWriter();
		writer.println("<h1>Hello " + yourName + "</h1>");
		writer.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String number1 = request.getParameter("number1");
		String number2 = request.getParameter("number2");
		String func = request.getParameter("function");
		
		int results=0;
		
		switch (func) {
        case "+": 
                 results = cal.add(Integer.parseInt(number1), Integer.parseInt(number2));
                 break;
        case "-":  
        results = cal.minus(Integer.parseInt(number1), Integer.parseInt(number2));
        break;
        case "*":  
        results = cal.times(Integer.parseInt(number1), Integer.parseInt(number2));
        break;
        case "/":  
        results = cal.divid(Integer.parseInt(number1), Integer.parseInt(number2));
        break;
        
        default: 
                 break;
    }
		PrintWriter writer = response.getWriter();
		writer.println("<h1>  " + number1 + " " + func + " "+ number2 + " =" + results + "</h1>");
		writer.close();
	}

}
