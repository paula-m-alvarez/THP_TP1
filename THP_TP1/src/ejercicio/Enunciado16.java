package ejercicio;

import java.util.Scanner;

public class Enunciado16 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cantidadInscriptos;
		int asientosDisponibles;
		int asientosFaltantes;
		
		System.out.println("Por favor ingrese la cantidad de inscriptos");
		cantidadInscriptos = Integer.parseInt(input.nextLine());
		
		System.out.println("Por favor indique los asientos disponibles");
		asientosDisponibles = Integer.parseInt(input.nextLine());
		
		if (cantidadInscriptos > asientosDisponibles ) {
			asientosFaltantes = cantidadInscriptos - asientosDisponibles ;
			System.out.println("Para que todos puedan ingresar faltan " + asientosFaltantes + "" + "asientos.");
		} else {
		  System.out.println("Los asientos alcanzan para el ingreso de todos");
		}

	}

}
