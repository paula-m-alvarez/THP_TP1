package ejercicio;

import java.util.Scanner;

public class Enunciado12 {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;

		System.out.println("Ingrese un numero");
		num1 = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese otro numero");
		num2 = Integer.parseInt(input.nextLine());

		if (num1 > num2) {
			System.out.println("El mayor es " + num1);
		} else {
			System.out.println("El mayor es " + num2);
		}

	}

}
