package ejercicio;

import java.util.Scanner;

public class Enunciado10 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String persona1;
		String persona2;
		String persona3;
		
		int totalCapital;
		int capital1;
		int capital2;
		int capital3;
		
		double porcentaje1;
		double porcentaje2;
		double porcentaje3;
		
		System.out.println("Por favor ingresa tu nombre y cuanto aportas");
		persona1 = input.nextLine();
		capital1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Por favor ingresa tu nombre y cuanto aportas");
		persona2 = input.nextLine();
		capital2 = Integer.parseInt(input.nextLine());
		
		System.out.println("Por favor ingresa tu nombre y cuanto aportas");
		persona3 = input.nextLine();
		capital3 = Integer.parseInt(input.nextLine());
		
		System.out.println("Los datos ingresados son los siguientes: " + persona1 + "" + capital1);
		System.out.println("Los datos ingresados son los siguientes: " + persona2 + "" + capital2);
		System.out.println("Los datos ingresados son los siguientes: " + persona3 + "" + capital3);

		totalCapital = capital1 + capital2 + capital3;
		
		System.out.println("El capital total es de " + totalCapital);
		
		porcentaje1 = capital1 * 100 / totalCapital;
		porcentaje2 = capital2 * 100 / totalCapital;
		porcentaje3 = capital3 * 100 / totalCapital;
		
		System.out.println("Porcentaje del inversor: " + persona1 + "" + porcentaje1 + "%");
		System.out.println("Porcentaje del inversor: " + persona2 + "" + porcentaje2 + "%");
		System.out.println("Porcentaje del inversor: " + persona3 + "" + porcentaje3 + "%");
	}

}
