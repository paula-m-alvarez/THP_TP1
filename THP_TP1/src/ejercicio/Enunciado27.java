package ejercicio;

import java.util.Scanner;

public class Enunciado27 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int MAYOR_EDAD = 18;
		final int CANT_EDADES = 5;
		
		int acumEdades = 0;
		int edad;
		double promedio = 0;
		int contImparMayor = 0;
		int contadorEdades;
		
		contadorEdades = 0;
		
		while (contadorEdades < CANT_EDADES ) {
			System.out.println("Ingrese la edad por favor");
			edad = Integer.parseInt(input.nextLine());
			
			if (edad % 2 != 0) {
				if(edad > MAYOR_EDAD) {
					contImparMayor++;
				}
			}
			
			acumEdades = acumEdades + edad;
			contadorEdades++;
		}
		
		promedio = acumEdades / CANT_EDADES;
		System.out.println("El promedio es :" + promedio);
		System.out.println("La cantidad de edades mayores e impares a " + MAYOR_EDAD + " son: " + contImparMayor );

	}

}
