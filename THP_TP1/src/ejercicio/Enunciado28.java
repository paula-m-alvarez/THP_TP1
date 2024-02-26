package ejercicio;

import java.util.Scanner;

public class Enunciado28 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cant;
		int numero;
		int mayor;
		int posicion;
		
		System.out.println("Ingrese una cantidad");
		cant = Integer.parseInt(input.nextLine());
		
		while (cant <= 0) {
			System.out.println("La cantidad ingresada es incorrecta, ingrese un valor mayor a 0");
		}
		
		System.out.println("Ingrese los numeros enteros");
		numero = Integer.parseInt(input.nextLine());
		
		mayor = numero;
		posicion = 1;
		
		for (int i = 2; i <= cant; i++) {
			if (numero > mayor) {
				mayor = numero;
				posicion = i;
			}
		}
		
		System.out.println("El mayor numero ingresado es " + mayor);
		System.out.println("Se encuentra en la posicion " + posicion);

	}

}
