package ejercicio;

import java.util.Scanner;

public class Enunciado34 {
	
	private static Scanner input = new Scanner(System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double alturaJugador;
		String jugador;
		double promedioAlturas;
		int cantJugadores = 0;
		double totalAlturas = 0;
		
		do {
			System.out.println("Ingrese la altura del jugador");
			alturaJugador = Integer.parseInt(input.nextLine());
			
			System.out.println("Ingrese el nombre del jugador");
			jugador = input.nextLine();
			
			totalAlturas += alturaJugador;
			cantJugadores++;
			
		} while(alturaJugador == 0);
		
		System.out.println("La altura de " + jugador + "es de " + alturaJugador);
		promedioAlturas = totalAlturas / cantJugadores;
		
		System.out.println("El promedio de las estaturas del equipo es de: " + promedioAlturas);

	}

}
