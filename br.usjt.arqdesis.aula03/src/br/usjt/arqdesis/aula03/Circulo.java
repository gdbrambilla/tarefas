package br.usjt.arqdesis.aula03;

public class Circulo extends Figura 
{
	
	public double raio;

	public Circulo(double raio) 
	{
		this.raio = raio;
	}

	@Override
	public double area() 
	{
		return 3.141592 * Math.pow(raio, 2);
	}

	@Override
	public double perimetro() 
	{
		return 2*(3.141592*raio);
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
