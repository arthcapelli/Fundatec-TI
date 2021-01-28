import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int n = 0;
		int negativos = 0;

		System.out.println("Digite o tamanho do array:");
		n = tec.nextInt();

		int numeros[] = new int[n];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Insira um número:");
			numeros[i] = tec.nextInt();
			if (numeros[i] < 0) {
				negativos++;
			}
		}
		System.out.println("A quantidade de negativos é: " + negativos);

	}

}
