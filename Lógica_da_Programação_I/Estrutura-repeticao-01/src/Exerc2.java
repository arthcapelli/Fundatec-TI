import java.util.Scanner;

public class Exerc2 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double inicio;
		double fim;

		System.out.println("Digite o primeiro numero:");
		inicio = tec.nextDouble();

		System.out.println("Digite o segundo numero:");
		fim = tec.nextDouble();

		for (double i = inicio; i <= fim; i++) {
			System.out.println(i);
		}
	}
}
