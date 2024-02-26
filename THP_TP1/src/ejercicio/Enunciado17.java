package ejercicio;

import java.util.Scanner;

public class Enunciado17 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String MSJ_JUB_OK = "Puede jubilarse";
		final String MSJ_JUB_NO_OK = "Aun no puede jubilarse";
		final int EDAD_MIN = 1;
		final int EDAD_MAX = 120;
		final int JUB_F = 60;
		final int JUB_M = 65;
		final char FEM = 'F';
		final char MASC = 'M';
		int edad;
		char genero;
		boolean seJubila = false;
		
		do {
			System.out.println("Ingresa una edad por favor");
			edad = Integer.parseInt(input.nextLine());
		} while (edad < EDAD_MIN || edad > EDAD_MAX);
		
		do {
			System.out.println("Ingresa tu genero por favor");
			genero = input.nextLine().toUpperCase().charAt(0);
		} while ( (genero != FEM) && (genero != MASC) );
		
		switch (genero) {
		case FEM:
			if ( edad >= JUB_F) {
				seJubila = true;
			}
			break;
		case MASC:
			if ( edad >= JUB_M) {
				seJubila = true;
			}
			break;
		}
		
		
		if (seJubila) {
			System.out.println(MSJ_JUB_OK);
		} else {
			System.out.println(MSJ_JUB_NO_OK);
		}
		
	}

}
