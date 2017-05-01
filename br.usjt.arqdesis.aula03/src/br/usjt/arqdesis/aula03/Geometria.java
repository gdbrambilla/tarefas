package br.usjt.arqdesis.aula03;

import java.util.ArrayList;

public class Geometria 
{
	ArrayList<Figura> fig = new ArrayList<>();

	public Geometria() 
	{
		//fig = new ArrayList<>();
	}
	
	public void AdicionaArray()
	{
		fig.add(new Quadrado(10,10));
		fig.add(new Retangulo(40,20));
		fig.add(new Circulo(10));
		fig.add(new Triangulo(10,10,5,8,10));
		fig.add(new Losango(50,40,10,5));
		fig.add(new Trapezio(50,40,30,20,10,9,8));
		fig.add(new Cubo(50,40,30,20,10));
		fig.add(new Esfera(50));
		fig.add(new Cilindro(50,40,30));
		fig.add(new Piramide(50,40,30,20));
	}

	public void ImprimeDados()
	{
		for(Figura figur:fig)
		{
			System.out.println("\nArea ----> " + figur.area());
			System.out.println("\nPerímetro -----> " + figur.perimetro());
			
			if(figur instanceof Diagonal)
			{
				System.out.println("\nDiagonal -----> " + ((Diagonal)figur).calculaDiagonal()); //Casting (Diagonal)
			}
			
			System.out.print("\nVolume " + figur.volume());
			
		}
	}
	
	
}
