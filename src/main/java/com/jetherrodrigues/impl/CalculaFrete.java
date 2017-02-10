package com.jetherrodrigues.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jetherrodrigues.interfaces.Instancia;
import com.jetherrodrigues.model.Frete;
import com.jetherrodrigues.util.Constantes;

public class CalculaFrete implements Instancia {
	
	public CalculaFrete() {
	}

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		double geocodigoA = new Double(request.getParameter("geocodigoA"));
		double geocodigoB = new Double(request.getParameter("geocodigoB"));
		
		// TODO Realizar aqui todo o processo de consulta ao BD e após 
		// retornar para a página que será exibido os valores;
		Frete frete = new Frete();
		
		return Constantes.raizPages + "calculo-frete.jsp";
	}

}
