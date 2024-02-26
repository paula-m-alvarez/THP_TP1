package ejercicio;

import java.util.Scanner;

public class PrimerClase {

	// Declaramos el escaner para poder ingresar algo al programa - parte 1

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Commentaries

		// Variables y constantes
		String nombre;
		String saludo = ", como estas?";
		int edad;
		char curso;
		double dolarOficial;

		// constante numero
		final char CURSO_OK = 'H';
		final int MAYOR_EDAD = 18;

		// programa

		System.out.println("Buenas noches, como te llamas?");

		// ingresamos el nombre (tipo String) -- con .toUpperCase() guardo todo en
		// mayuscula
		nombre = input.nextLine().toUpperCase();

		System.out.println(nombre + saludo);

		// ingresamos la edad (tipo int)
		// input.nextIn() este es el input para un dato del tipo int pero no maneja el
		// enter, ojo!
		System.out.println("ingresa tu edad");
		edad = Integer.parseInt(input.nextLine());

		System.out.println("Tu edad es: " + edad);


		if (edad >= MAYOR_EDAD) {
			// ingresamos el curso (tipo char)
			System.out.println("por favor ingresa el curso: ");
			curso = input.nextLine().toUpperCase().charAt(0);

			System.out.println("El curso es: " + curso);
			
			if (curso == CURSO_OK) {
				// ingresamos el dolarOficial (tipo double)
				// input.nextDouble() este es el input para un dato del tipo double pero no
				// maneja el enter, ojo!
				System.out.println("Por favor ingere cotizacion del dolar oficial");
				dolarOficial = Double.parseDouble(input.nextLine());
				
				System.out.println("cotizacion Dolar hoy: " + dolarOficial);
			} else {
				System.out.println("No te preocupes, le pregunto a otra persona");
			}
		} else {
			System.out.println("Aun no tiene la edad necesaria para esar en el curso");
		}

	}

}
