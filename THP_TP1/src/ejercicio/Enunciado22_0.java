package ejercicio;

public class Enunciado22_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int INICIO = 1;
		final int FIN = 5;

		int numero;

		numero = INICIO;

		while (numero <= FIN) {
			System.out.println("numero: " + numero);

			numero++;
		}
		
		numero = FIN;

		while (numero >= INICIO) {
			System.out.println("numero: " + numero);

			numero--;
		}

	}

}
