package ejercicio;

import java.util.Scanner;

public class Enunciado07 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int ALTURA = 2;
		final int ALTURA2 = 4;
		final int ALTURA3 = 6;
		int ancho;
		int largo;
		int totalTerreno;
		
		System.out.println("Ingrese el ancho del terreno por favor");
		ancho = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese el largo del terreno por favor");
		largo = Integer.parseInt(input.nextLine());
		
		
		totalTerreno = ancho * largo;
		
		System.out.println("El total del terreno es :" + totalTerreno );
		
		// Como calcular alambrado
		
	}

}
