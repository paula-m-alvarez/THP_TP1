package ejercicio;

import java.util.Scanner;

public class Enunciado33 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int FIN = 0;
		int numero;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		System.out.println("Ingrese un numero por favor");
		numero = Integer.parseInt(input.nextLine());
		
		while(numero != FIN){
			if(numero < min) {
				min = numero;
			}
			
			if (numero > max) {
				max = numero;
			}
			
			System.out.println("Ingrese un numero por favor");
			numero = Integer.parseInt(input.nextLine());
		}
		
		System.out.println("El valor maximo es: " + max);
		System.out.println("El valor minimo es: " + min);
	}

}
