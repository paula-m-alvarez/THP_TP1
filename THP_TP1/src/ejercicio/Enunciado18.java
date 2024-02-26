package ejercicio;

import java.util.Scanner;

public class Enunciado18 {
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1;
		int numero2;
		
		System.out.println("Por favor ingrese un numero");
		numero1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Por favor ingrese otro numero");
		numero2 = Integer.parseInt(input.nextLine());
		
		if ( numero1 % numero2 == 0 ){
			System.out.println("El numero mayor es divisible por el menor");
		} else {
			System.out.println("El numero mayor no es divisible por el menor");
		}
		
	}

}
