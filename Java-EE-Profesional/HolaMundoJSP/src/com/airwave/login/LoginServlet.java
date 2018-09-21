package com.airwave.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airwave.login.bean.Login;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//request = todo lo que recibimos del html / response = todo lo que enviamos al html
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");				//Parametros del form 
		String password = request.getParameter("password");
		
		Login login = new Login();
		login.setName(name);
		login.setPassword(password);
		boolean autenticado = login.autenticacion();
		
		//Ayuda a generar las respuestas que debemos enviar / disparador de las respuestas
		//El objeto RequestDispatcher nos sirve para invocar de modo directo a un recurso web, encapsularlo y mostrarlo en un Servlet/jsp.
		RequestDispatcher dispatcher = null;
		if (autenticado) {
			dispatcher = request.getRequestDispatcher("welcome.jsp");
		}else {
			dispatcher = request.getRequestDispatcher("error.jsp");
		}
		
		dispatcher.forward(request, response);
		
	}

}
