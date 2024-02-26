package ejercicio;

import java.util.Scanner;

public class Enunciado29 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int NOTA_MIN = 0;
		final int NOTA_MAX = 0;
		int nota;
		boolean notaValida = false;
		
		System.out.println("Por favor ingresar una nota");
		nota = Integer.parseInt(input.nextLine());
		
		notaValida = nota >= NOTA_MIN && nota <= NOTA_MAX;
		
		while(!notaValida) {
			System.out.println("La nota es incorrecta, ingresar nuevamente");
			nota = Integer.parseInt(input.nextLine());
		}
		
		System.out.println("La nota ingresada es: " + nota);
	}

}
