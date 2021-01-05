import java.util.Scanner;

public class exerc8 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		String nome;
		double port;
		double mat;
		double gerais;
		double media;

		System.out.println("Insira o nome do(a) candidato(a):");
		nome = tec.next();

		System.out.println("Insira a nota em Portugues:");
		port = tec.nextDouble();

		System.out.println("Insira a nota em Matematica:");
		mat = tec.nextDouble();

		System.out.println("Insira a nota em Conhecimentos Gerais:");
		gerais = tec.nextDouble();

		media = (port + mat + gerais) / 3;

		System.out.println("O(a) candidato(a) " + nome + ", obteve as seguintes notas, Portugues: " + port
				+ ", Matemática: " + mat + ", e Conhecimentos Gerais: " + gerais + ", tendo média final de: " + media);

		if (media < 7 || mat < 5 || port < 5 || gerais < 5) {
			System.out.println("Candidato reprovado!");

		} else {
			System.out.println("Canditado aprovado!");
		}
	}
}
