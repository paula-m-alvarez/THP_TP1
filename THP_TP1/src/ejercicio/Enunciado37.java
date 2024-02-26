package ejercicio;

import java.util.Scanner;

public class Enunciado37 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int AÑO = 12;
		String nombreEmpleado;
		int sueldo = 0;
		int totalSueldo = 0;
		int meses = 0;
		
		System.out.println("Por favor ingrese su nombre");
		nombreEmpleado = input.nextLine();
		
		do {
			System.out.println("Por favor ingrese su sueldo del mes");
			sueldo = Integer.parseInt(input.nextLine());
			
			meses++;
			totalSueldo += sueldo;
			
		} while(meses > AÑO || sueldo > -1);
		
		System.out.println(nombreEmpleado + " su monto total percibido es de " + totalSueldo);
		
	}

}
