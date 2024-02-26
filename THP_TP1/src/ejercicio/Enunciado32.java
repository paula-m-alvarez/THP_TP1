package ejercicio;

import java.util.Scanner;

public class Enunciado32 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int NOTA_MIN = 0;
		final int NOTA_MAX = 0;
		int nota;
		boolean notaValida = false;
		boolean nuevaValidacion = false;
		
		System.out.println("Por favor ingresar una nota");
		nota = Integer.parseInt(input.nextLine());
		
		notaValida = nota >= NOTA_MIN && nota <= NOTA_MAX;
		
		nuevaValidacion = nota == 2 && nota >= 4 && nota <= 10;
		
		while(!notaValida && !nuevaValidacion) {
			if (nota != 0) {
				System.out.println("La nota es incorrecta, ingresar nuevamente");
				nota = Integer.parseInt(input.nextLine());
			} else {
				System.out.println("Se coloca ausente");
			}
		}
		
		System.out.println("La nota ingresada es: " + nota);
	}
}
