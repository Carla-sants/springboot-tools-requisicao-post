package br.unigoias.formas.model;

public class forma1 {
	private double raio;
	
	private double pi;
	
	public forma1() {
	}

	public forma1(double raio, double pi) {
		this.raio = raio;
		this.pi = 3.1415;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getPi() {
		return 3.1415;
	}

	public void setPi(double pi) {
		this.pi = 3.1415;
	}
	
	public double getArea () {
		return (raio * raio) * 3.1415;
	}

	@Override
	public String toString() {
		return "forma1 [raio=" + raio + ", pi=" + pi + ", getArea()=" + getArea() + "]";
	}
	
}