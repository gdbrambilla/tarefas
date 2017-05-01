package br.usjt.arqdesis.aula03;

public class Triangulo extends Poligono 
{
	private double la,lb,lc;

	public Triangulo(double base, double altura,double la,double lb,double lc) 
	{
		super(base, altura);
		this.la = la;
		this.lb = lb;
		this.lc = lc;
	}

	@Override
	public double area() 
	{
		return (base*altura)/2;
	}

	@Override
	public double perimetro() 
	{
		return (la*lb) + (lb*lc) + (lc*la);
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
