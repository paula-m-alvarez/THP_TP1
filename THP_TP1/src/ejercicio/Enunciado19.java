package ejercicio;

import java.util.Scanner;

public class Enunciado19 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		boolean esDeUnSoloDigito = false;
		boolean esImpar = false;
		boolean estaEnAmbosGrupos = false;
		boolean noEstaEnNnigunGrupo = false;
		
		System.out.println("Por favor ingrese un numero");
		numero = Integer.parseInt(input.nextLine());
		
		if (numero > -10 && numero < 10){
			esDeUnSoloDigito = true;
		} 
		
		if ((numero % 2) != 0){
			esImpar = true;
		} 
		
		if ( esDeUnSoloDigito && esImpar ){
			estaEnAmbosGrupos = true;
			
			if (!esDeUnSoloDigito && !esImpar) {
				noEstaEnNnigunGrupo = true;
			}
		} 
		
		System.out.println("El numero ingresado es " + numero);
		System.out.println("Es de un solo digito " + esDeUnSoloDigito );
		System.out.println("Es impar " + esImpar);
		System.out.println("No esta en ningun grupo " + noEstaEnNnigunGrupo );
		
	}

}
