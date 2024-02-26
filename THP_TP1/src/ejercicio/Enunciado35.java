package ejercicio;

import java.util.Scanner;

public class Enunciado35 {
	
	private static Scanner input = new Scanner(System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String FIN = "*";
		String nombre = null;
		int edad;
		String nombreMasJoven = null;
		int edadMasJoven = 0;
		
		do {
			
			System.out.println("Por favor ingrese un nombre");
			nombre = input.nextLine();
			
			System.out.println("Por favor ingrese su edad");
			edad = Integer.parseInt(input.nextLine());
			
			if(edadMasJoven == 0 || edad < edadMasJoven) {
				edadMasJoven = edad;
				nombreMasJoven = nombre;
			}
			
		} while (nombre.equals(FIN));
		
		System.out.println("La persona mas joven es" + nombreMasJoven);

	}

}
