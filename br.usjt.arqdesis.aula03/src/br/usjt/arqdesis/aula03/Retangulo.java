package br.usjt.arqdesis.aula03;

public class Retangulo extends Poligono implements Diagonal
{

	public Retangulo(double base, double altura) 
	{
		super(base, altura);
	}
	
	@Override
	public double area() 
	{
		return base*altura;
	}

	@Override
	public double calculaDiagonal() 
	{
		return Math.sqrt( ((base*base) + (altura * altura)) );
	}

	@Override
	public double perimetro() 
	{
		return (2*base) + (2*altura);
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
