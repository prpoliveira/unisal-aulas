package com.jetherrodrigues.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = "")
public class AuditoriaFiltro implements Filter{

	public void destroy() {		
		// TODO Pode ser implementado alguma ação quando se destroi a instancia;
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filter)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
	}

	public void init(FilterConfig config) throws ServletException {
		// TODO Pode ser implementado alguma ação quando se inicia a instancia;		
	}

}
