package br.unigoias.formas.model;

public class formas {
	private double altura;
	
	private double largura;
	
	public formas() {
	}

	public formas(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public double getArea () {
		return altura * largura;
	}

	@Override
	public String toString() {
		return "formas [altura=" + altura + ", largura=" + largura + ", getArea()=" + getArea() + "]";
	}
	
}
		
	
