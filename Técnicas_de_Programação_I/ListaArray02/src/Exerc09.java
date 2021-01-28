import java.util.Scanner;

public class Exerc09 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int somaMenor7 = 0;
		int contMaior15 = 0;
		int contMaior7 = 0;
		int somaMaior7 = 0;
		double mediaMaior7 = 0;
		int n = 0;

		int arrayA[] = new int[10];

		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Insira os valores do array:");
			n = tec.nextInt();
			arrayA[i] = n;

			if (arrayA[i] < 7) {
				somaMenor7 += arrayA[i];
			}

			if (arrayA[i] > 15) {
				contMaior15++;
			}

			if (arrayA[i] > 7) {
				somaMaior7 += arrayA[i];
				contMaior7++;
			}
		}

		mediaMaior7 = somaMaior7 / contMaior7;

		System.out.println("A soma dos elementos inferiores a 7 é: " + somaMenor7);
		System.out.println("----------");
		System.out.println("Quantidade de elementos superiores a 15 é: " + contMaior15);
		System.out.println("----------");
		System.out.println("Média dos elementos maiores que 7 é: " + mediaMaior7);
	}

}
