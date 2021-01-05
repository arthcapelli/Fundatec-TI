import java.util.Scanner;

public class Exerc5 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double idade;
		double contI = 0;
		double mediaI = 0;
		double somaI = 0;
		double peso;
		double contP = 0;
		double mediaP = 0;
		double somaP = 0;

		for (int i = 0; i < 20; i++) {
			System.out.println("Insira uma idade:");
			idade = tec.nextDouble();
			contI++;
			somaI += idade;

			System.out.println("Insira um peso:");
			peso = tec.nextDouble();
			contP++;
			somaP += peso;

		}
		mediaI = somaI / contI;
		mediaP = somaP / contP;

		System.out.println("A média de idade foi: " + mediaI);
		System.out.println("O total das idades foi: " + somaI);
		System.out.println("A média de peso foi: " + mediaP);
		System.out.println("O total dos pesos foi: " + somaP);
	}
}
