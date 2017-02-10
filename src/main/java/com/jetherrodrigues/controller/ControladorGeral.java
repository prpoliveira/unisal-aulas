package com.jetherrodrigues.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jetherrodrigues.interfaces.Instancia;

@WebServlet(urlPatterns = "/controlador-geral")
public class ControladorGeral extends HttpServlet{
	
	private static final long serialVersionUID = -3214432047220516430L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/**
		 * Recupera qual instancia deve ser criada via Reflection
		 */
		String instancia = req.getParameter("execute");
		if (instancia == null) 
			throw new IllegalArgumentException("O parametro execute n�o pode estar nulo!");
		
		StringBuilder classe = new StringBuilder();
		classe.append("com.jetherrodrigues.impl.");
		classe.append(instancia);
		
		try {
			Class<?> type = Class.forName(classe.toString().trim());
			Instancia criarInstancia = (Instancia) type.newInstance();
			String pagina = criarInstancia.executa(req, resp);
			
			RequestDispatcher dispatcher = req.getRequestDispatcher(pagina);
			dispatcher.forward(req, resp);
			
		} catch (Exception e) {
			throw new ServletException(e);
		} 
	}
	
}
