import java.util.Scanner;

public class exerc4 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int valor1 = 0;
		int valor2 = 0;
		int valor3 = 0;

		while (valor1 == valor2 || valor1 == valor3 || valor2 == valor3) {
			System.out.println("Informe o valor 1:");
			valor1 = tec.nextInt();

			System.out.println("Informe o valor 2:");
			valor2 = tec.nextInt();

			System.out.println("Informe o valor 3:");
			valor3 = tec.nextInt();

		}
		int soma = valor1 + valor2 + valor3;
		int mult = valor1 * valor2 * valor3;
		System.out.println("A soma dos 3 valores é: " + soma);
		System.out.println("A multiplicação dos 3 valores é: " + mult);
	}
}
