package br.usjt.arqdesis.aula03;

public class Esfera extends Figura {

	public double raio;
	
	public Esfera(double raio) 
	{
		this.raio = raio;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return ((4*3.14)*(Math.pow(raio, 3)));
	}

}
