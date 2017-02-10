package com.jetherrodrigues.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jetherrodrigues.interfaces.Instancia;
import com.jetherrodrigues.util.Constantes;

public class Logout implements Instancia {

	public String executa(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		session.removeAttribute("usuario.hashcode");
		session.invalidate();
		
		return Constantes.raiz + "index.jsp";
	}

}
