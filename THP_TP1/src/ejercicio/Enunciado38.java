package ejercicio;

import java.util.Scanner;

public class Enunciado38 {
	
	private static Scanner input = new Scanner(System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int MAX_INTENTOS = 3;
		final String USUARIO = "admin";
		final String CONTRASEÑA = "123456";
		final String ACCESO = "Acceso concedido";
		final String BLOQUEADO = "Se ha bloqueado la cuenta";
		int intentos = 0;
		String usuarioIngresado;
		String contraseñaIngresada;
		boolean valido = false;
		
		do {
			System.out.println("Ingrese nombre de usuario");
			usuarioIngresado = input.nextLine();
			
			System.out.println("Ingrese la contraseña");
			contraseñaIngresada = input.nextLine();
			
			if (usuarioIngresado == USUARIO && contraseñaIngresada == CONTRASEÑA  ) {
				valido = true;
				System.out.println(ACCESO);
			}
			
		} while(intentos > MAX_INTENTOS || valido == true );
		
		if (valido) {
			System.out.println(BLOQUEADO);
		}

	}

}
