import java.util.Scanner;

public class Exerc3 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		Integer inicio;
		Integer fim;

		System.out.println("Digite o primeiro numero inteiro:");
		inicio = tec.nextInt();

		System.out.println("Digite o segundo numero inteiro:");
		fim = tec.nextInt();

		for (int i = inicio; i <= fim; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " é par!");
			} else {
				System.out.println(i + " é ímpar!");
			}
		}

	}

}
