package ejercicio;

import java.util.Scanner;

public class Enunciado20 {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variables

		int num1;
		int num2;
		double result = 0;

		char op;
		final char SUMA = '+';
		final char REST = '-';
		final char MULTI = '*';
		final char DIVI = '/';
		

		final String DIV0 = "No se puede dividir por 0!";
		
		// Program

		System.out.println("Ingrese un numero");
		num1 = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese otro numero");
		num2 = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese la operacion que desea realizar");
		op = input.nextLine().charAt(0);

		switch (op) {
		case SUMA:
			result = num1 + num2;
			break;
		case REST:
			result = num1 - num2;
			break;
		case MULTI:
			result = num1 * num2;
			break;
		case DIVI:
			if (num2 != 0) {
			result = num1 / num2;
			} else {
				System.out.println(DIV0);
			}
			break;

		default:
			System.out.println("Operador invalido");
			break;
		}
		
		System.out.println("El resultado es: " + result);

	}

}
