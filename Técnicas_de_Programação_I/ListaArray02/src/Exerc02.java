import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		int n = 0;
		int positivos = 0;

		System.out.println("Digite o tamanho do array:");
		n = tec.nextInt();

		double numeros[] = new double[n];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Insira um número:");
			numeros[i] = tec.nextDouble();
			if (numeros[i] >= 0) {
				positivos++;
			}
		}
		System.out.println("A quantidade de positivos é: " + positivos);

	}
}
