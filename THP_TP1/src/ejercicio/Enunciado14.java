package ejercicio;

import java.util.Scanner;

public class Enunciado14 {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double ALTURA_MIN = 1.50;
		final int EDAD_MIN = 7;
		final String MENSAJE_OK = "Puede subir a la montaña rusa";
		final String MENSAJE_NO_OK = "No puede subir a la montaña rusa";

		int edad;
		double altura;
		boolean sube = false;

		System.out.println("Ingresa tu edad por favor");
		edad = Integer.parseInt(input.nextLine());

		if (edad >= EDAD_MIN) {
			System.out.println("Ingresa tu altura por favor");
			altura = Double.parseDouble(input.nextLine());

			if (altura >= ALTURA_MIN) {
				sube = true;
			}
		}

		if (sube) {
			System.out.println(MENSAJE_NO_OK);
		} else {
			System.out.println(MENSAJE_OK);
		}

	}

}
