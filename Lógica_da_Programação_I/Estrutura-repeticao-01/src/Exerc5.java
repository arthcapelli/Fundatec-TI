import java.util.Scanner;

public class Exerc5 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double idade;
		double soma;
		Integer cont;
		double media;

		idade = 0;
		soma = 0;
		cont = 0;
		media = 0;

		while (idade != -1) {
			System.out.println("Informe uma idade:");
			idade = tec.nextInt();
			if (idade != -1) {
				cont++;
				soma += idade;

			}

		}
		media = soma / cont;
		System.out.println("A soma das idades é: " + soma);
		System.out.println("A media das idades é: " + media);
	}
}
