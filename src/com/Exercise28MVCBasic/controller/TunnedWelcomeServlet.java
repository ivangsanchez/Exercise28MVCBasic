package com.Exercise28MVCBasic.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TunnedWelcomeServlet
 */
@WebServlet("/TunnedWelcomeServlet")
public class TunnedWelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String miMensaje =request.getParameter("txtMessage");
		
		response.getWriter().append("Welcome to my MVC Exercise!! You are the best, "+miMensaje);
	}

}
