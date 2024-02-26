package ejercicio;

import java.util.Scanner;

public class Enunciado24 {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;

		System.out.println("Por favor ingrese el primer valor");
		num1 = Integer.parseInt(input.nextLine());

		System.out.println("Por favor ingrese un segundo valor");
		num2 = Integer.parseInt(input.nextLine());

		// Validar que num2 sea mayor o igual a num1

		while (num1 > num2) {
			System.out.println("el numero ingresado es incorrecto" + "este debe ser mayor o igual a " + num1);
			num2 = Integer.parseInt(input.nextLine());
		}

		// Incluyendo los ingresados

		System.out.println("Secuencia de numeros incluyendo los ingresados");
		for (int i = num1; i <= num2; i++) {
			System.out.println(i);
		}

		// System.out.println("Hasta aca estamos bien");

		System.out.println("Secuencia de numeros excluyendo los ingresados");
		for (int i = num1 + 1; i < num2; i++) {
			System.out.println(i);
		}

	}

}
