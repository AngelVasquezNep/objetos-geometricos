package com.angelvasquez.objetosgeometricos.figuras;

public class Cuadrado {
	private int dimension;
	public float size;

	public Cuadrado ( float size, int dimension) {
		super();
		this.dimension = dimension;
		this.size = size;
	}

	public double area () {
		return Math.pow(size, dimension) ;
	}

	public float perimetro () {
		return size * dimension * 2;
	}

}
