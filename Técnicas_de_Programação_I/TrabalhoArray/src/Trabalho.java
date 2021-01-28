import java.util.Scanner;

public class Trabalho {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		int opcao = 0;
		int quantidadeAlunosTurma = 0;
		int posicaoAtual = 0;
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double soma = 0;
		double mediaAluno = 0;
		double mediaTurma = 0;
		double somaMedias = 0;

		System.out.println("Insira a quantidade de alunos da turma: ");
		quantidadeAlunosTurma = tec.nextInt();
		String alunos[] = new String[quantidadeAlunosTurma];
		double medias[] = new double[quantidadeAlunosTurma];

		// para ser aprovado o aluno precisa ter media maior igual a 7
		while (opcao != 7) {

			System.out.println(" ");
			System.out.println("1 - Cadastrar aluno informado nome e média final");
			System.out.println("2 - Exibir alunos cadastrados");
			System.out.println("3 - Exibir a média da turma");
			System.out.println("4 - Exibir alunos aprovados");
			System.out.println("5 - Exibir alunos reprovados");
			System.out.println("6 - Exibir os alunos acima da média da turma");
			System.out.println("7 - Sair");
			System.out.println(" ");

			opcao = tec.nextInt();

			if (opcao == 1) {
				if (posicaoAtual == quantidadeAlunosTurma) {
					System.out.println("A turma ja possui a capacidade mÃ¡xima");
				} else {
					System.out.println("Informe o nome do aluno");
					alunos[posicaoAtual] = tec.next();

					System.out.println("Insira a primeira nota do aluno:");
					nota1 = tec.nextDouble();
					System.out.println("Insira a segunda nota do aluno:");
					nota2 = tec.nextDouble();
					System.out.println("Insira a terceira nota do aluno:");
					nota3 = tec.nextDouble();

					soma = nota1 + nota2 + nota3;
					mediaAluno = soma / 3;
					medias[posicaoAtual] = mediaAluno;
					somaMedias += mediaAluno;
					posicaoAtual++;
				}
			} else if (opcao == 2) {
				for (int i = 0; i < alunos.length; i++) {
					if (alunos[i] != null) {
						System.out.println(alunos[i] + " tem media " + medias[i]);
					}
				}
			} else if (opcao == 3) {
				mediaTurma = somaMedias / posicaoAtual;
				System.out.println("A média da turma, com " + posicaoAtual + " alunos cadastrados é: " + mediaTurma);

			} else if (opcao == 4) {
				for (int i = 0; i < alunos.length; i++) {
					if (medias[i] >= 7) {
						System.out.println("O aluno(a) " + alunos[i] + " está aprovado(a) com média " + medias[i]);
					}
				}
			} else if (opcao == 5) {
				for (int i = 0; i < alunos.length; i++) {
					if (alunos[i] != null) {
						if (medias[i] < 7) {
							System.out.println(
									"O(a) aluno(a) " + alunos[i] + " está reprovado(a) com média " + medias[i]);
						}
					}

				}

			} else if (opcao == 6) {

				for (int i = 0; i < alunos.length; i++) {
					if (medias[i] > mediaTurma) {
						System.out.println("O(a) aluno(a) " + alunos[i] + " tem média " + medias[i]
								+ " e está acima da média da turma de " + mediaTurma);

					}
				}
			}
		}
	}
}
