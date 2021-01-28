import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int n = 0;

		System.out.println("Insira o tamanho do array:");
		n = tec.nextInt();

		int numeros[] = new int[n];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Insira os valores do array:");
			numeros[i] = tec.nextInt();
			if (numeros[i] % 2 == 0) {
				numeros[i] = 1;
			} else {
				numeros[i] = -1;
			}
		}
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Valor da posição " + (i + 1) + " = " + numeros[i]);
		}

	}

}
