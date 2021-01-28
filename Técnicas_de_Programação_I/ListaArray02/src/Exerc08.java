import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int arrayA[] = new int[10];
		int arrayB[] = new int[10];
		int n = 0;

		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Insira um numero inteiro:");
			n = tec.nextInt();
			arrayA[i] = n;
			arrayB[i] = arrayA[i] * 5;

		}

		for (int i = 0; i < arrayB.length; i++) {
			System.out.println("Valor da posição " + i + ": Array 1 = " + arrayA[i] + ", Array 2 = " + arrayB[i]);
		}

	}

}
