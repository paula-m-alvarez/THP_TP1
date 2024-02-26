package ejercicio;

import java.util.Scanner;

public class Enunciado03 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		int resultado_mult;
		int resultado_div;
		
		System.out.println("Por favor ingresa un numero");
		numero = Integer.parseInt(input.nextLine());
		
		resultado_mult = numero * 5;
		
		System.out.println("El numero ingresado por 5 es igual a : " + resultado_mult );
		
		resultado_div = numero / 2;
		
		System.out.println("El numero ingresado dividio por 2 es igual a : " + resultado_div);
		
	}

}
