package ejercicio;

import java.util.Scanner;

public class Enunciado05 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;
		int num2;
		int aux;
		
		System.out.println("Ingrese un numero por favor");
		num1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese otro numero por favor");
		num2 = Integer.parseInt(input.nextLine());
		
		System.out.println("Los numeros son: " + num1 + " y " + num2);
		
		aux = num1;
		num1 = num2;
		num2 = aux;
		
		
		System.out.println("Los numeros invertidos son: " + num1 + " y " + num2);
	}

}
