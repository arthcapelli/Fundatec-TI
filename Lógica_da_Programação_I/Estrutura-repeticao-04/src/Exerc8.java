import java.util.Scanner;

public class Exerc8 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double num;
		double cont = 0;

		System.out.println("Insira um n�mero:");
		num = tec.nextDouble();

		for (double i = 1; i <= num; i++) {
			if (num % i == 0) {
				cont++;
			}

		}
		if (cont == 2) {
			System.out.println("O n�mero " + num + " � primo!");
		} else {
			System.out.println("O n�mero " + num + " n�o � primo!");
		}
	}
}
