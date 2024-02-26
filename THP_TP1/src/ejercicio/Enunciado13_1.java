package ejercicio;

import java.util.Scanner;

public class Enunciado13_1 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("Ingrese un numero");
		num1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese otro numero");
		num2 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese otro numero");
		num3 = Integer.parseInt(input.nextLine());
		
		if (num1 > num2 && num1 > num3) { 
			System.out.println("El numero mayor es " + num1);
		} else {
			if (num2 > num1 && num2 > num3) {
				System.out.println("El numero mayor es " + num2);
			} else {
				System.out.println("El numero mayor es " + num3);
			}
		}

	}

}
