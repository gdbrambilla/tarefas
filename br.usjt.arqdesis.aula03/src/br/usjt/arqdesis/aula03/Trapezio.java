package br.usjt.arqdesis.aula03;

public class Trapezio extends Poligono {
	
	private double basemenor, eb, ec, db, dc;

	public Trapezio(double base, double altura, double basemenor, double eb, double ec, double db, double dc) 
	{
		super(base, altura);
		this.basemenor = basemenor;
		this.eb = eb;
		this.ec = ec;
		this.db = db;
		this.dc = dc;
	}
	
	@Override
	public double area() 
	{
		return ((base + basemenor)*altura)/2;
	}

	@Override
	public double perimetro() 
	{	
		return ((eb*ec) + (ec*db) + (db*dc) + (dc*eb));
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
