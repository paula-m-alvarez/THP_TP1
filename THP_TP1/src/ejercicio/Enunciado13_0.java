package ejercicio;

import java.util.Scanner;

public class Enunciado13_0 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;
		int num2;
		int num3;
		int maximo;
		
		System.out.println("Ingrese un numero");
		num1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese otro numero");
		num2 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese otro numero");
		num3 = Integer.parseInt(input.nextLine());
		
		if (num1 > num2) {
			maximo = num1;
		} else { 
			maximo = num2;
		}
		
		if (num3 > maximo) {
			maximo = num3;
		}
		
		System.out.println("El valor maximo es " + maximo);
	

	}

}
