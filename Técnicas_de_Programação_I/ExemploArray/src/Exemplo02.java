import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		double positivos[] = new double[10];
		boolean negativo = false;

		for (int i = 0; i < positivos.length; i++) {
			System.out.println("Informe um n�mero positivo:");
			positivos[i] = tec.nextDouble();
			
			if (positivos[i] < 0) {
				negativo = true;
				break;
			}
		}

		for (int i = 0; i < positivos.length; i++) {
			System.out.println("N�mero " + (i + 1) + ": " + positivos[i]);
			if (positivos[i] < 0) {
				negativo = true;
				break;
			}
		}

		System.out.println("");

		if (negativo == true) {
			System.out.println("N�mero negativo inserido, comece novamente!");
		}

	}

}
