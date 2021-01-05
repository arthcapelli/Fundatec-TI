import java.util.Scanner;

public class Exerc6 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double num;
		double somaPos = 0;
		int contN = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um numero:");
			num = tec.nextDouble();

			if (num >= 0) {
				somaPos += num;
			}
			if (num < 0) {
				contN++;
			}

		}
		System.out.println("A soma dos positivos é: " + somaPos);
		System.out.println("A quantidade de negativos é: " + contN);
	}
}
