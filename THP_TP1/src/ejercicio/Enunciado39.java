// Grupal - Alvarez Paula Maria - Juan Cruz Cobo - Victoria Candela Vasquez

package ejercicio;

import java.util.Scanner;

public class Enunciado39 {
    private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        final int CANTIDAD_DISPAROS = 3;
        final int MINIMO_PARTICIPANTES = 2;
        int puntajeMayor = Integer.MIN_VALUE;
        int tirosAlCentro = 0;		
        int cantidadJugadores = 0;
        String nombreMayorPuntaje = "";

        // Pedir la cantidad de jugadores hasta que se ingrese un n�mero v�lido
        do {
            System.out.println("Por favor ingrese la cantidad de jugadores (m�nimo " + MINIMO_PARTICIPANTES + "): ");
            cantidadJugadores = input.nextInt();
            input.nextLine(); 
        } while(cantidadJugadores < MINIMO_PARTICIPANTES);

        // Iterar sobre cada jugador
        for (int i = 1; i <= cantidadJugadores; i++) {
            int puntaje = 0;
            String nombre;

            // Pedir el nombre del jugador hasta que se ingrese algo
            do {
                System.out.println("Ingrese el nombre del jugador " + i + ": ");
                nombre = input.nextLine();				
            } while(nombre.equals(""));

            // Pedir la distancia de los tres disparos del jugador
            for (int j = 1; j <= CANTIDAD_DISPAROS; j++) {
                int distancia = -1;

                // Pedir la distancia hasta que se ingrese un n�mero v�lido
                do {
                    System.out.println("Ingrese la distancia del tiro " + j + " del jugador " + nombre + " (m�nimo: 0): "); 
                    distancia = input.nextInt();
                    input.nextLine(); 
                } while (distancia < 0);

                // Calcular el puntaje para el disparo actual
                if (distancia == 0) {
                    puntaje += 500;
                    tirosAlCentro += 1;
                } else if (distancia > 0 && distancia <= 10) {
                    puntaje += 250;
                } else if (distancia > 10 && distancia <= 50) {
                    puntaje += 100;
                }
            }

            // Verificar si el jugador actual tiene el puntaje mayor
            if (puntaje > puntajeMayor) {
                puntajeMayor = puntaje;
                nombreMayorPuntaje = nombre;
            }

            // Limpiar el puntaje del jugador actual para la siguiente iteraci�n
            puntaje = 0;
        }

        // Anunciar el jugador con el puntaje mayor y la cantidad de tiros al centro
        System.out.println("El ganador del torneo es " + nombreMayorPuntaje + ", con " + puntajeMayor + " puntos.");
        System.out.println("Hubieron " + tirosAlCentro + " tiros al centro.");
	}

}
