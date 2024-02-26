package ejercicio;

import java.util.Scanner;

public class Enunciado25 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ancho;
		int alto;
		
		System.out.println("Ingresa cuantos caracteres queres que sea de ancho la matriz:");
		ancho = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingresa cuantos caracteres queres que sea de alto la matriz:");
		alto = Integer.parseInt(input.nextLine());
		
		
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				System.out.print('@');
			}
			System.out.println();
		}
		
	}

}
