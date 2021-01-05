import java.util.Scanner;

public class exerc1 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double vel;
		double maxima;
		double dif;
		String dados = "S";

		while (dados.equals("S")) {
			System.out.println("Informe a velocidade:");
			vel = tec.nextDouble();

			System.out.println("Informe a velocidade maxima:");
			maxima = tec.nextDouble();

			dif = vel - maxima;

			if (dif >= 31) {
				System.out.println("Multa de R$300");
			} else if (dif >= 11 && dif <= 30) {
				System.out.println("Multa de R$100");
			} else if (dif >= 1 && dif <= 10) {
				System.out.println("Multa de R$50");
			}
			System.out.println("Deseja inserir mais dados?");
			dados = tec.next();

		}

	}
}
