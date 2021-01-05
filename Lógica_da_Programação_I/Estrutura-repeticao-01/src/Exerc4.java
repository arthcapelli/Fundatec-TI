import java.util.Scanner;

public class Exerc4 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		Integer idade;

		idade = 0;

		while (idade < 1000) {
			System.out.println("Informe uma idade:");
			idade = tec.nextInt();
			idade += idade;

		}
		System.out.println("A soma das idades é: " + idade);
	}
}
