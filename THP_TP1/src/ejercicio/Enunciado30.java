package ejercicio;

import java.util.Scanner;

public class Enunciado30 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final char SUMA = '+';
		final char REST = '-';
		final char MULT = '*';
		final char DIV = '/';
		
		final char FIN = 'F';
		
		char op;
		int resultado = 0;
		
		int numero1;
		int numero2;
		
		boolean valido = false;
		
		do {
			System.out.println("Ingrese una operacion por favor");
			op = input.nextLine().charAt(0);
			valido = op != SUMA && op != REST && op != MULT && op != DIV && op != FIN;
			
		} while (valido);
		
		while (op != FIN) {
			
			resultado = 0;
			
			System.out.println("Ingrese un numero");
			numero1 = Integer.parseInt(input.nextLine());
			

			System.out.println("Ingrese otro numero");
			numero2 = Integer.parseInt(input.nextLine());
			
			switch (op) {
			case SUMA:
				resultado = numero1 + numero2;
				break;
			case REST:
				resultado = numero1 - numero2;
				break;
			case MULT:
				resultado = numero1 * numero2;
				break;
			case DIV:
				if (numero2 != 0) {
					resultado = numero1/numero2;
				} else {
					System.out.println("No se puede divir por 0");
				}
				break;
			}
			
		}
		
		System.out.println("El resultado es " + resultado);

	}

}
