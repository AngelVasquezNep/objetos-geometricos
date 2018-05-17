package com.angelvasquez.objetosgeometricos.figuras;

public class Cubo extends Cuadrado {

	public Cubo(float size, int dimension) {
		super(size, dimension);
	}
	
	public double volumen () {
		return this.size * this.area() ;
	}
	
	
}
