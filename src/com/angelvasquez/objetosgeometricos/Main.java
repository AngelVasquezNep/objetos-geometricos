package com.angelvasquez.objetosgeometricos;

import java.util.Scanner;

import com.angelvasquez.objetosgeometricos.figuras.Cuadrado;
import com.angelvasquez.objetosgeometricos.figuras.Cubo;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		menu();
	}

	public static void menu () {
		int exit = 0;
		float size = 0;
		
		System.out.println("Bienvenidos");

		do {
			System.out.println("Quiere:");
			System.out.println("1) Ingresar un valor.");
			System.out.println("2) Salir.");
			exit = entrada.nextInt();
			if( exit == 1 ) {
				int opcion = 1;
				System.out.print("¿Qué valor quiere calcular?: ");
				size = entrada.nextFloat();
				
				Cuadrado cuadrado = new Cuadrado (size, 2);
				Cubo cubo = new Cubo (size, 3);
				
				while ( opcion != 0 ) {
					System.out.println("Con el valor que nos proporcionó, quiere calcular: ");
					System.out.println("1.- El área de un cuadrado.");
					System.out.println("2.- El perímetro de un cuadrado.");
					System.out.println("3.- El área de un cubo.");
					System.out.println("4.- El volumen de un cubo.");
					System.out.println("0.- Regresar al menú principal.");
					System.out.println( "Su opción: " );
					System.out.println();
					opcion = entrada.nextInt();
					
					opciones( opcion, size,cuadrado, cubo );
					
					System.out.println();
				} 
			} else if ( exit != 2 ) {
				System.out.println("Por favor ingrese una opción válida.");
			}
			
		} while ( exit != 2 );
		
		System.out.println("Fin del programa");
	}

	public static void opciones ( float opcion, float size , Cuadrado cuadrado, Cubo cubo ) {
		switch ( (int) opcion) {
		case 1:
			System.out.println( "El área del cuadrado de tamaño " + size + " es: " + cuadrado.area() );
			break;
		case 2:
			System.out.println( "El perímetro del cuadrado de tamaño " + size + " es: " + cuadrado.perimetro() );
			break;
		case 3:
			System.out.println( "El área del cubo de tamaño " + size + " es: " + cubo.area() );
			break;
		case 4:
			System.out.println( "El volumen del cubo de tamaño " + size + " es: " + cubo.volumen() );
			break;
		case 0:
			break;
		default:
			System.out.println("Opción no válida.");
			System.out.println();
			break;
		}
	}
}














