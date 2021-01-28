import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		String nomes[] = new String[10];
		String nome = "";
		boolean achou = false;
		int posicao = 0;

		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Informe um nome:");
			nomes[i] = tec.next();
		}

		System.out.println("Insira um nome para procurar:");
		nome = tec.next();

		for (int i = 0; i < nomes.length; i++) {
			if (nome.equals(nomes[i])) {
				achou = true;
				posicao = i;
				break;
			}
		}

		if (achou == true) {
			System.out.println("ACHEI NA POSIÇÃO: " + posicao);
		} else {
			System.out.println("NÃO ACHEI");
		}

	}

}
