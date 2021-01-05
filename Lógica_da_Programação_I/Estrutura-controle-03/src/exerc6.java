import java.util.Scanner;

public class exerc6 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double max;
		double min;
		double atual;
		double media;

		System.out.println("Insira a quantidade máxima em estoque:");
		max = tec.nextDouble();

		System.out.println("Insira a quantidade mínima em estoque:");
		min = tec.nextDouble();

		System.out.println("Insira a quantidade atual em estoque:");
		atual = tec.nextDouble();

		media = (max + min) / 2;

		if (atual >= media) {
			System.out.println("Não efetuar compra! Em estoque: " + atual + ", média: " + media);
		} else {
			System.out.println("Efetuar compra! Em estoque: " + atual + ", média: " + media);
		}

	}
}
