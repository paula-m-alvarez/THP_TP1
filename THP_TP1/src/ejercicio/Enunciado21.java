package ejercicio;

import java.util.Scanner;

public class Enunciado21 {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variables
		int numeroDia;

		System.out.println("Ingresa un numero del 1 al 7");
		numeroDia = Integer.parseInt(input.nextLine());

		switch (numeroDia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Lunes");
			break;
		case 3:
			System.out.println("Martes");
			break;
		case 4:
			System.out.println("Miercoles");
			break;
		case 5:
			System.out.println("Jueves");
			break;
		case 6:
			System.out.println("Viernes");
			break;
		case 7:
			System.out.println("Sabado");
			break;

		default:
			System.out.println("Error");
			break;
		}

	}

}
