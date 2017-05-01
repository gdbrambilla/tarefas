package br.usjt.arqdesis.aula03;

public class Cilindro extends Poligono {

	private double raio;
	
	public Cilindro(double base, double altura, double raio) 
	{
		super(base, altura);
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
	public double volume() 
	{	
		return (3.14*(Math.pow(raio, 2)*altura));
	}

}
