import java.util.Scanner;

public class exerc6 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int soma = 0;
		int mult = 1;
		int n;

		System.out.println("Insira um numero inteiro e positivo:");
		n = tec.nextInt();

		while (n > 0) {
			if (n % 2 == 0) {
				soma += n;
			}
			if (n % 2 != 0 && n != 0) {
				mult = mult * n;
			}
			System.out.println("Insira um numero inteiro e positivo:");
			n = tec.nextInt();
		}
		System.out.println("A soma dos pares é: " + soma);
		System.out.println("A multiplicação dos ímpares é: " + mult);
	}
}
