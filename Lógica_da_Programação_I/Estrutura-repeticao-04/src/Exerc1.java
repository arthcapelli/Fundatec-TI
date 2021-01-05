import java.util.Scanner;

public class Exerc1 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int num = 0;
		int somaP = 0;
		int somaI = 0;

		while (num <= 1000) {

			if (num % 2 == 0) {
				somaP += num;
			} else {
				somaI += num;
			}
			System.out.println("Digite um numero inteiro:");
			num = tec.nextInt();

		}
		System.out.println("A soma dos pares é: " + somaP);
		System.out.println("A soma dos ímpares é: " + somaI);
	}
}
