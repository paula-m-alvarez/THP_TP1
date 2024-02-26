package ejercicio;

import java.util.Scanner;

public class Enunciado06 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int SUELDO_FIJO = 44000;
		int comision = 16;
		int totalVentas;
		double sueldo;
		double resultadoComision;
		
		System.out.println("Por favor ingresar el monto total de ventas realizadas en el mes");
		totalVentas = Integer.parseInt(input.nextLine());
		
		resultadoComision = comision * 100 / totalVentas;
		
		sueldo = SUELDO_FIJO + resultadoComision;
		System.out.println("El sueldo a cobrar es de :" + sueldo);
		
	}

}
