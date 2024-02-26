package ejercicio;

import java.util.Scanner;

public class Enunciado09 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int SUMA_TOTAL_ANGULOS = 180;
		int angulo1;
		int angulo2;
		int angulo3;
		
		System.out.println("Por favor ingrese un angulo del triangulo");
		angulo1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Por favor ingrese otro angulo del triangulo");
		angulo2 = Integer.parseInt(input.nextLine());
		
		angulo3 = (angulo1 + angulo2) - SUMA_TOTAL_ANGULOS;
		
		System.out.println("El angulo restante es de :" + angulo3);
		
		
	}

}
