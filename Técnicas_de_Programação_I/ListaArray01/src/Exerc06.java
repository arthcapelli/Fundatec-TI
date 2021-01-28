import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int n = 0;

		System.out.println("Insira o  tamanho dos arrays:");
		n = tec.nextInt();
		double arrayA[] = new double[n];
		double arrayB[] = new double[n];
		double resultado[] = new double[n];

		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Insira os valores do array A:");
			arrayA[i] = tec.nextDouble();
			System.out.println("Insira os valores do array B:");
			arrayB[i] = tec.nextDouble();

			resultado[i] = arrayA[i] * arrayB[i];
		}

		for (int i = 0; i < resultado.length; i++) {
			System.out.println("Resultado, multiplicação de: " + arrayA[i] + " + " + arrayB[i] + " = " + resultado[i]);
		}

	}

}
