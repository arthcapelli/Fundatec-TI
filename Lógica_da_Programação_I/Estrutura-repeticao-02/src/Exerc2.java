import java.util.Scanner;

public class Exerc2 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double num;
		double ant;
		double suc;
		double quad;
		double dobro;
		double metade;

		for (int i = 0; i < 15; i++) {
			System.out.println("Insira um n�mero:");
			num = tec.nextInt();
			ant = num - 1;
			System.out.println("O antecessor de " + num + " � " + ant);

			suc = num + 1;
			System.out.println("O sucessor de " + num + " � " + suc);

			quad = num * num;
			System.out.println("O quadrado de " + num + " � " + quad);

			dobro = num * 2;
			System.out.println("O dobro de " + num + " � " + dobro);

			metade = num / 2;
			System.out.println("A metade de " + num + " � " + metade);

		}
	}
}
