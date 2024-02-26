package ejercicio;

import java.util.Scanner;

public class Enunciado11 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		final int VAL_MOD = 2;
		
		System.out.println("Ingrese un numero");
		numero = Integer.parseInt(input.nextLine());
		
		if ((numero % VAL_MOD) == 0) {
			System.out.println("El numero ingresado es PAR");
		} else { 
			System.out.println("El numero ingresado es IMPAR");
		}
		
	}

}
