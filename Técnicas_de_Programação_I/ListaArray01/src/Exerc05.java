import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double numeros[] = new double[20];
		double num = 0;
		int contPar = 0;
		int contImp = 0;
		int cont = 0;

		while (cont < numeros.length) {
			System.out.println("Insira um número entre 100 e 500:");
			num = tec.nextDouble();

			if (num >= 100 && num <= 500) {
				numeros[cont] = num;
				cont++;
				if (num % 2 == 0) {
					contPar++;
				} else {
					contImp++;
				}

			} else {
				System.out.println("Digite um número válido!");
				System.out.println("--------");
			}
		}

		System.out.println("Quantidade de pares: " + contPar);
		System.out.println("Quantidade de ímpares: " + contImp);
	}

}
