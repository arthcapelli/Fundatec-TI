import java.util.Scanner;

public class Exerc2 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double cont = 0;
		double media = 0;
		double maior = 0;
		double menor = 0;
		double mediaA = 0;
		double soma = 0;

		while (media >= 0) {

			if (media > maior) {
				maior = media;
			}
			if (media < menor) {
				menor = media;
			}
			soma += media;
			System.out.println("Insira uma média:");
			media = tec.nextDouble();
			if (cont == 0) {
				maior = media;
				menor = media;
			}
			cont++;
		}
		mediaA = soma / (cont-1);
		System.out.println("A maior média é: " + maior);
		System.out.println("A menor média é: " + menor);
		System.out.println("A média aritmética é: " + mediaA);
	}
}
