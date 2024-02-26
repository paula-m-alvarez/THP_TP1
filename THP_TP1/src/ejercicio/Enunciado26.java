package ejercicio;
import java.util.Scanner;

public class Enunciado26 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int caso;
		
		System.out.println("ingresa un numero: ");
		num = Integer.parseInt(input.nextLine());
		for (int i = 1; i < num; i++) {
			caso = 3 * i;
			if ((caso %5) != 0) {
				System.out.print("El numero es: " + caso);
			}
			System.out.println();			
			
		}
			}

}