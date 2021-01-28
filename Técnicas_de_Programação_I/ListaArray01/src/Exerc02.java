import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		String nomes[] = new String[10];

		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Informe um nome:");
			nomes[i] = tec.next();
		}
		
		System.out.println("");

		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Nome " + i + ": " + nomes[i]);
		}

	}

}
