import java.util.Scanner;

public class exerc3 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int cod = 0;
		int cand1 = 0;
		double perc1 = 0;
		int cand2 = 0;
		double perc2 = 0;
		int cand3 = 0;
		double perc3 = 0;
		int cand4 = 0;
		double perc4 = 0;
		int nulo = 0;
		double percNulo = 0;
		int branco = 0;
		double percBranco = 0;
		int total = 0;

		while (cod != -1) {
			System.out.println(
					"Insira de 1 a 4 para o respectivo candidato, 5 para nulo, 6 para branco e -1 para sair do programa:");
			cod = tec.nextInt();

			if (cod == 1) {
				cand1++;
			}
			if (cod == 2) {
				cand2++;
			}
			if (cod == 3) {
				cand3++;
			}
			if (cod == 4) {
				cand4++;
			}
			if (cod == 5) {
				nulo++;
			}
			if (cod == 6) {
				branco++;
			}
			total++;

		}
		perc1 = (cand1 * 100) / total;
		perc2 = (cand2 * 100) / total;
		perc3 = (cand3 * 100) / total;
		perc4 = (cand4 * 100) / total;
		percNulo = (nulo * 100) / total;
		percBranco = (branco * 100) / total;

		System.out.println("O candidato 1 teve " + cand1 + " votos, sendo " + perc1 + "% do total.");
		System.out.println("O candidato 2 teve " + cand2 + " votos, sendo " + perc2 + "% do total.");
		System.out.println("O candidato 3 teve " + cand3 + " votos, sendo " + perc3 + "% do total.");
		System.out.println("O candidato 4 teve " + cand4 + " votos, sendo " + perc4 + "% do total.");
		System.out.println(nulo + " votos foram nulos, sendo " + percNulo + "% do total.");
		System.out.println(branco + " votos foram branco, sendo " + percBranco + "% do total.");

	}
}
