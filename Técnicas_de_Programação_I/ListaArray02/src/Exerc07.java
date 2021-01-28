import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int numeros[] = new int[10];
		int numeros2[] = new int[10];
		int n = 0;

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Insira um numero inteiro:");
			n = tec.nextInt();
			numeros[i] = n;

			if (numeros[i] % 2 == 0) {
				numeros2[i] = numeros[i] * 2;
			} else {
				numeros2[i] = numeros[i] * 3;
			}
		}

		for (int i = 0; i < numeros2.length; i++) {
			System.out.println("Valor da posição " + i + ": Array 1 = " + numeros[i] + ", Array 2 = " + numeros2[i]);
		}

	}

}
