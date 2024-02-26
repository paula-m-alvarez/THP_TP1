package ejercicio;

import java.util.Scanner;

public class Enunciado36 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int FIN = 20;
		int num;
		int cantNum = 0;
		int promedio;
		int sumNum = 0;
		
		do {
			System.out.println("Ingrese un numero");
			num = Integer.parseInt(input.nextLine());
			cantNum++;
			sumNum = sumNum + num;
			promedio = sumNum/cantNum;
			
			
		} while (promedio < FIN);
		
		System.out.println("La cantidad de numeros ingresados es: " + cantNum);

	}

}
