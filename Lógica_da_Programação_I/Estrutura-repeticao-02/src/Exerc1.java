import java.util.Scanner;

public class Exerc1 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double media;
		Integer falta;

		for (int i = 0; i < 50; i++) {
			System.out.println("Insira a m�dia do aluno:");
			media = tec.nextDouble();
			System.out.println("Insira as faltas do aluno:");
			falta = tec.nextInt();

			if (media >= 7 && falta < 15) {
				System.out.println("Aluno aprovado por m�dia e presen�a!");
			} else if (media >= 7 && falta >= 15) {
				System.out.println("Aluno aprovado por m�dia mas reprovado por presen�a!");
			} else if (media < 7 && falta < 15) {
				System.out.println("Aluno reprovado por m�dia mas aprovado por presen�a!");
			} else {
				System.out.println("Aluno reprovado por m�dia e presen�a!");
			}
		}
	}
}
