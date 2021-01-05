import java.util.Scanner;

public class Exerc7 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double num;
		double somaP = 0;
		double somaN = 0;
		double contP = 0;
		double contN = 0;
		double mediaP;
		double mediaN;
		double contPar = 0;

		System.out.println("Insira um número:");
		num = tec.nextDouble();

		while (num != 0) {
			if (num > 0) {
				somaP += num;
				contP++;
				if (num % 2 == 0) {
					contPar++;
				}
			}
			if (num < 0) {
				somaN += num;
				contN++;
			}
			System.out.println("Insira um número:");
			num = tec.nextDouble();
		}
		System.out.println("A soma dos positivos é: " + somaP);
		System.out.println("A soma dos negativos é: " + somaN);

		mediaP = somaP / contP;
		System.out.println("A média dos positivos é: " + mediaP);

		mediaN = somaN / contN;
		System.out.println("A média dos negativos é: " + mediaN);

		System.out.println("A quantidade de pares é: " + contPar);
	}
}
