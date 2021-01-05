import java.util.Scanner;

public class exerc9 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double A;
		double B;
		double C;
		double soma;

		System.out.println("Insira o numero A:");
		A = tec.nextDouble();

		System.out.println("Insira o numero B:");
		B = tec.nextDouble();

		System.out.println("Insira o numero C:");
		C = tec.nextDouble();

		soma = A + B;

		if (soma >= C) {
			System.out.println("A soma de A+B � maior ou igual a C.");

		} else {
			System.out.println("A soma de A+B � menor que C.");

		}
	}
}
