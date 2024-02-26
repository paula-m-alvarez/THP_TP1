package ejercicio;

import java.util.Scanner;

public class Enunciado08 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;
		int num2;
		int resultado;
		
		System.out.println("Ingresar un numero: ");
		num1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingresar un segundo numero: ");
		num2 = Integer.parseInt(input.nextLine());
		
		resultado = num1 + num2;
		System.out.println("La suma es igual a " + resultado);
		
		resultado = num1 - num2;
		System.out.println("La resta es igual a " + resultado);
		
		resultado = num1 * num2;
		System.out.println("La multiplicacion es igual a " + resultado);
		
		if (num2 != 0) {
			resultado = num1 / num2;
			System.out.println("La division es igual a " + resultado);
		} else {
			System.out.println("Ingrese un numero mayor a 0");
		}
	}

}
