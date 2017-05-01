package br.usjt.arqdesis.aula03;

public class Losango extends Poligono implements Diagonal {
	
	private double dmaior,dmenor;

	public Losango(double base, double altura,double maior, double menor) 
	{
		super(base, altura);
		dmaior = maior;
		dmenor = menor;
	}

	@Override
	public double area() 
	{	
		return (base*altura)/2;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 4*base;
	}

	@Override
	public double calculaDiagonal() 
	{	
		return (dmaior*dmenor)/2;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
