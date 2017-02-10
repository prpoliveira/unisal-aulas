package com.jetherrodrigues.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jetherrodrigues.interfaces.Instancia;
import com.jetherrodrigues.util.Constantes;

public class Login implements Instancia {

	public String executa(HttpServletRequest request, HttpServletResponse response) {
		// TODO Realiza o login validando o usuário e então encaminha para o início
		return Constantes.raizPages + "inicio.jsp";
	}

}
