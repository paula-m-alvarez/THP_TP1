package ejercicio;

import java.util.Scanner;

public class Enunciado04 {
	
	private static Scanner input = new Scanner(System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valorHora;
		int sueldoSemanal;
		int horasTrabajadas = 44;
		
		System.out.println("Por favor ingresar el valor por hora");
		valorHora = Integer.parseInt(input.nextLine());
		
		sueldoSemanal = horasTrabajadas * valorHora;
		
		System.out.println("El sueldo semana es de " + sueldoSemanal);
		
	}

}
