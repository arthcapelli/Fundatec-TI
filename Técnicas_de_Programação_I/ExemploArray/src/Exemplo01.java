import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		String frutas[] = new String[10];
		boolean temBanana = false;

		for (int i = 0; i < frutas.length; i++) {
			System.out.println("Informe uma fruta:");
			frutas[i] = tec.next();
		}

		for (int i = 0; i < frutas.length; i++) {
			System.out.println("Fruta " + (i + 1) + ": " + frutas[i]);
		}

		for (int i = 0; i < frutas.length; i++) {
			if (frutas[i].equals("Banana") || frutas[i].equals("banana")) {
				temBanana = true;
				break;
			}
		}

		System.out.println("");

		if (temBanana == true) {
			System.out.println("Tem banana na lista!");
		} else {
			System.out.println("Não tem banana na lista!");
		}

	}

}
