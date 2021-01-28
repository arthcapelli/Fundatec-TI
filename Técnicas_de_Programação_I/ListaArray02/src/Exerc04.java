import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double valor = 0;
		int n = 0;
		int numeros[] = new int[20];
		double resultado = 0;

		System.out.println("Insira um valor qualquer:");
		valor = tec.nextDouble();

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite os valores do array:");
			numeros[i] = tec.nextInt();
		}

		for (int i = 0; i < numeros.length; i++) {
			resultado = valor * numeros[i];
			System.out.println(
					"Resultado da posição " + (i + 1) + ": " + numeros[i] + " * " + valor + " = " + resultado);
		}

	}

}
