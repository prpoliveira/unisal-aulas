package com.jetherrodrigues.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(urlPatterns = "/*")
public class AuditoriaFiltro implements Filter{

	public void destroy() {		
		// TODO Pode ser implementado alguma a��o quando se destroi a instancia;
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filter) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		System.out.println("Imprimindo a URI: " + req.getRequestURI());
		System.out.println("Imprimindo a URL: " + req.getRequestURL() + "/" + req.getQueryString());
		
		filter.doFilter(request, response);
	}

	public void init(FilterConfig config) throws ServletException {
		// TODO Pode ser implementado alguma a��o quando se inicia a instancia;		
	}

}
