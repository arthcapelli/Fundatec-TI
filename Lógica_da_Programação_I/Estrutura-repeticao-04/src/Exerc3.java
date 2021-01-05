import java.util.Scanner;

public class Exerc3 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int num = 0;
		int somaP = 0;
		int somaI = 0;
		int somaTotal = 0;
		int cont = 0;

		while (num >= 0) {

			if (num % 2 == 0) {
				somaP += num;
			} else {
				somaI += num;
			}

			somaTotal += num;
			cont++;
			System.out.println("Digite um numero inteiro:");
			num = tec.nextInt();

		}
		System.out.println("Foram digitados " + (cont-1) + " números.");
		System.out.println("A soma de todos os valores é: " + somaTotal);
		System.out.println("A soma dos pares é: " + somaP);
		System.out.println("A soma dos ímpares é: " + somaI);
	}
}
