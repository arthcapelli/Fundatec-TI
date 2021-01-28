import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		String frutas[] = new String[10];
		String fruta = "";
		boolean achouFruta = false;

		for (int i = 0; i < frutas.length; i++) {
			System.out.println("Insira o nome de uma fruta");
			frutas[i] = tec.next();
		}

		System.out.println("Insira uma fruta para pesquisar:");
		fruta = tec.next();

		for (int i = 0; i < frutas.length; i++) {
			if (fruta.equals(frutas[i])) {
				achouFruta = true;
				break;
			}
		}

		if (achouFruta) {
			System.out.println("Tem " + fruta + " na lista!");
		} else {
			System.out.println("Não tem " + fruta + " na lista!");
		}

	}

}
