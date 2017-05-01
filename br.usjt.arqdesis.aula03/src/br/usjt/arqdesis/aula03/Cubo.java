package br.usjt.arqdesis.aula03;

public class Cubo extends Poligono 
{
	
	private double aa,ab,ac;

	public Cubo(double base, double altura,double aa, double ab, double ac) 
	{
		super(base, altura);
		this.aa = aa;
		this.ab = ab;
		this.ac = ac;
	}

	@Override
	public double area() 
	{	
		return 0;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double volume() 
	{	
		return aa*ab*ac;
	}
	
	

}
