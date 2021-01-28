import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int pares = 0;
		int impares = 0;
		int n = 0;

		System.out.println("Insira o tamanho do array:");
		n = tec.nextInt();

		int numeros[] = new int[n];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Insira os valores do array:");
			numeros[i] = tec.nextInt();
			if (numeros[i] % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}

		System.out.println("A quantidade de pares é: " + pares);
		System.out.println("A quantidade de ímpares é: " + impares);

	}

}
