package com.jetherrodrigues.model;
import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Frete implements Serializable{
	private static final long serialVersionUID = -3654883223185910358L;
	private String pontoA;
	private String pontoB;
	private double distancia;
	private double valorFrete;
	
	public Frete() {
		
	}
	
	public String getPontoA() {
		return pontoA;
	}
	public void setPontoA(String pontoA) {
		this.pontoA = pontoA;
	}
	public String getPontoB() {
		return pontoB;
	}
	public void setPontoB(String pontoB) {
		this.pontoB = pontoB;
	}
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	public double getValorFrete() {
		return valorFrete;
	}
	public void setValorFrete(double valorFrete) {
		this.valorFrete = valorFrete;
	}	
}
