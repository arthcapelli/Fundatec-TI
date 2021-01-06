import java.util.Scanner;

public class Trabalho {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int opcao = 0;
		String nome = "";
		String nomeMaiorM = "";
		String nomeMenorM = "";
		double nota1;
		double nota2;
		double nota3;
		double media = 0;
		double menorM = 0;
		double maiorM = 0;
		double acimaM = 0;
		double percA = 0;
		double abaixoM = 0;
		double percR = 0;
		double totalAlunos = 0;

		while (opcao != 5) {

			if (opcao == 1) {

				System.out.println("Insira o nome do aluno:");
				nome = tec.next();

				System.out.println("Insira a nota 1:");
				nota1 = tec.nextDouble();

				System.out.println("Insira a nota 2:");
				nota2 = tec.nextDouble();

				System.out.println("Insira a nota 3:");
				nota3 = tec.nextDouble();

				media = (nota1 + nota2 + nota3) / 3;

				if (media >= 7 && media <= 10) {
					acimaM++;
				} else if (media < 7 && media >= 0) {
					abaixoM++;
				}

				if (totalAlunos == 0) {
					maiorM = media;
					menorM = media;
					nomeMaiorM = nome;
					nomeMenorM = nome;
				}

				if (media > maiorM) {
					maiorM = media;
					nomeMaiorM = nome;
				}

				if (media < menorM) {
					menorM = media;
					nomeMenorM = nome;
				}

				totalAlunos++;

			} else if (opcao == 2) {
				System.out.println("O aluno com maior média é " + nomeMaiorM + ", com média de " + maiorM);
				System.out.println("O aluno com menor média é " + nomeMenorM + ", com média de " + menorM);

			} else if (opcao == 3) {
				System.out.println("Quantidade de alunos acima da média: " + acimaM);
				System.out.println("Quantidade de alunos abaixo da média: " + abaixoM);

			} else if (opcao == 4) {
				percA = (acimaM * 100) / totalAlunos;
				percR = (abaixoM * 100) / totalAlunos;

				System.out.println("O percentual de aprovados é: " + percA + "%");
				System.out.println("O percentual de reprovados é: " + percR + "%");

			}

			System.out.println("-----------------------------------------------------------");
			System.out.println("1 - Cadastrar nova nota de aluno");
			System.out.println("2 - Ver a maior e menor media");
			System.out.println("3 - Ver a quantidade de alunos acima e abaixo da media");
			System.out.println("4 - Ver o percentual de alunos aprovados e reprovados");
			System.out.println("5 - Sair");
			System.out.println("-----------------------------------------------------------");

			opcao = tec.nextInt();

		}
	}
}
