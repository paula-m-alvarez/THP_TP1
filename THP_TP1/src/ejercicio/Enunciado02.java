package ejercicio;

import java.util.Scanner;

public class Enunciado02 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double nota1;
		double nota2;
		double nota3;
		double suma;
		double promedio;
		
		final double CANT_NOTAS = 3;
		
		System.out.println("Por favor ingrese la primer nota");
		nota1= Double.parseDouble(input.nextLine());
		
		
		System.out.println("Por favor ingrese la segunda nota");
		nota2 = Double.parseDouble(input.nextLine());
		
		
		System.out.println("Por favor ingrese la tercera nota");
		nota3 = Double.parseDouble(input.nextLine());
		
		suma = (nota1 + nota2 + nota3 );
		promedio = suma / CANT_NOTAS;
		
		System.out.println("El promedio es " + promedio);
		
	}

}
