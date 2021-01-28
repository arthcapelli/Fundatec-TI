import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double arrayA[] = new double[20];
		double arrayB[] = new double[20];
		double arrayC[] = new double[20];

		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Insira os valores do array A:");
			arrayA[i] = tec.nextDouble();
			System.out.println("Insira os valores do array B:");
			arrayB[i] = tec.nextDouble();

			arrayC[i] = arrayA[i] + arrayB[i];
		}

		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Array A, posição " + i + ", valor: " + arrayA[i]);
		}

		System.out.println("--------");

		for (int i = 0; i < arrayB.length; i++) {
			System.out.println("Array B, posição " + i + ", valor: " + arrayB[i]);
		}

		System.out.println("--------");

		for (int i = 0; i < arrayC.length; i++) {
			System.out.println("Array C, soma de: " + arrayA[i] + " + " + arrayB[i] + " = " + arrayC[i]);
		}

	}

}
