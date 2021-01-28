import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double notas[] = new double[20];
		double soma = 0;
		double media = 0;
		int acimaMedia = 0;

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Insira a nota de um aluno:");
			notas[i] = tec.nextDouble();
			soma += notas[i];
		}

		media = soma / notas.length;

		for (int i = 0; i < notas.length; i++) {
			if (notas[i] > media) {
				acimaMedia++;
			}
		}

		System.out.println("Média da turma: " + media);
		System.out.println("Quantidade de alunos que foram acima dessa média: " + acimaMedia);

	}

}
