package br.usjt.arqdesis.aula03;

public class Quadrado extends Poligono implements Diagonal 
{

	public Quadrado(double base, double altura) 
	{
		super(base, altura);
	}	
	
	@Override
	public double area() 
	{
		return Math.pow(altura, 2);
	}


	@Override
	public double calculaDiagonal() 
	{
		return altura*Math.sqrt(2);
	}

	@Override
	public double perimetro() 
	{
		return 4*altura;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

	
	

}
