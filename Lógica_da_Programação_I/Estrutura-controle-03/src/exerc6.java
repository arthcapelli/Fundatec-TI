import java.util.Scanner;

public class exerc6 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double max;
		double min;
		double atual;
		double media;

		System.out.println("Insira a quantidade m�xima em estoque:");
		max = tec.nextDouble();

		System.out.println("Insira a quantidade m�nima em estoque:");
		min = tec.nextDouble();

		System.out.println("Insira a quantidade atual em estoque:");
		atual = tec.nextDouble();

		media = (max + min) / 2;

		if (atual >= media) {
			System.out.println("N�o efetuar compra! Em estoque: " + atual + ", m�dia: " + media);
		} else {
			System.out.println("Efetuar compra! Em estoque: " + atual + ", m�dia: " + media);
		}

	}
}
