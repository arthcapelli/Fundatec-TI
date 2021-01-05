import java.util.Scanner;

public class exemplo2While {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		String nome;
		String opcao;

		double nota1;
		double nota2;
		double media;

		opcao = "S";

		while (opcao.equals("S")) {
			System.out.println("Insira o nome do aluno:");
			nome = tec.nextLine();

			System.out.println("Informe a nota 1:");
			nota1 = tec.nextInt();

			System.out.println("Informe a nota 2:");
			nota2 = tec.nextInt();

			media = (nota1 + nota2) / 2;

			System.out.println(nome + " tem media igual a " + media);
			
			System.out.println("Deseja continuar?");
			opcao = tec.next();
		}
	}
}
