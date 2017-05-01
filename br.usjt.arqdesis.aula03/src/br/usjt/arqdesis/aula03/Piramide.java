package br.usjt.arqdesis.aula03;

public class Piramide extends Poligono {
	
	private double ladoa,ladob;

	public Piramide(double base, double altura,double a, double b)
	{
		super(base, altura);
		ladoa = a;
		ladob = b;
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
		return (ladoa*ladob*altura)/3;
	}

}
