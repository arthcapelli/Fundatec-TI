import java.util.Scanner;

public class Exerc1 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double media;
		Integer falta;

		for (int i = 0; i < 50; i++) {
			System.out.println("Insira a média do aluno:");
			media = tec.nextDouble();
			System.out.println("Insira as faltas do aluno:");
			falta = tec.nextInt();

			if (media >= 7 && falta < 15) {
				System.out.println("Aluno aprovado por média e presença!");
			} else if (media >= 7 && falta >= 15) {
				System.out.println("Aluno aprovado por média mas reprovado por presença!");
			} else if (media < 7 && falta < 15) {
				System.out.println("Aluno reprovado por média mas aprovado por presença!");
			} else {
				System.out.println("Aluno reprovado por média e presença!");
			}
		}
	}
}
