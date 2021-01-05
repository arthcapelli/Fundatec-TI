import java.util.Scanner;

public class Exerc4 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int idade = 0;
		int cont21 = 0;
		int cont50 = 0;

		while (idade >= 0) {
			System.out.println("Insira uma idade:");
			idade = tec.nextInt();

			if (idade < 21 && idade > 0) {
				cont21++;
			}
			if (idade > 50) {
				cont50++;
			}
		}
		System.out.println("O total de pessoas com menos de 21 foi: " + cont21);
		System.out.println("O total de pessoas com mais de 50 foi: " + cont50);
	}
}
