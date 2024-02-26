package ejercicio;

public class Enunciado22_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int INICIO = 1;
		final int FIN = 5;

		int numero;

		numero = INICIO;

		do {
			System.out.println("numero: " + numero);
			numero++;
		} while (numero <= FIN);
		
		System.out.println("--------------------------");
		
		numero = FIN;
				
		do {
			System.out.println("numero: " + numero);
			numero--;
		} while (numero >= INICIO);

	}

}