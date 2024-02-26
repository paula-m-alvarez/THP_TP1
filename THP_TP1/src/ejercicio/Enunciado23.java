package ejercicio;

import java.util.Scanner;

public class Enunciado23 {
	
	private static Scanner input = new Scanner(System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 0;
		int resultadoMultiplicacion;
		
		System.out.println("Ingrese un numero por favor");
		numero = Integer.parseInt(input.nextLine());
		
	    for (int i = 1; i > 10; i++) {
	    	resultadoMultiplicacion = numero * i;
			System.out.println(numero + "" + "*" + "" + i + "" + "=" + "" + resultadoMultiplicacion);
		}
		
	}

}
