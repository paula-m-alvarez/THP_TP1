package ejercicio;

import java.util.Scanner;

public class Enunciado15 {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variables
		int edad;
		final int EDAD_MINIMA = 6;
		double altura;
		final double ALT_MINIMA = 1.5;

		final String PUEDE = "Puede entrar al juego";
		final String NO_PUEDE = "Ups, no puede entrar";

		boolean sube = false;

		// Program
		
		System.out.println("Ingrese la edad");
		edad = Integer.parseInt(input.nextLine());

		if (edad > EDAD_MINIMA) {
			sube = true;
		} else {
			System.out.println("Ingrese la altura");
			altura = Double.parseDouble(input.nextLine());

			if (altura > ALT_MINIMA) {
				sube = true;
			}
		}

		
		if (sube) {
			System.out.println(PUEDE);
		} else {
			System.out.println(NO_PUEDE);
		}

	}

}
