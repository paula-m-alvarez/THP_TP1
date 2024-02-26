package ejercicio;

import java.util.Scanner;

public class Enunciado31 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final char SI = 'S';
		final char NO = 'N';
		char ingresoUsuario;
		
		System.out.println("¿Deseas continuar? [S / N]");
		ingresoUsuario = input.nextLine().charAt(0);
		
		while(ingresoUsuario == SI || ingresoUsuario == NO) {
			if (ingresoUsuario == SI) {
				System.out.println("Continua la operacion");
			} else {
				System.out.println("No continua con la operacion");
			}
		}
		
		System.out.println("Los datos ingresados son incorrectos vuelva a intentar");
	}

}
