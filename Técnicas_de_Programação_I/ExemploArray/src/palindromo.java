import java.util.Scanner;

public class palindromo {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		String palavra = "";
		String palavraAoContrario = "";

		System.out.println("Informe uma palavra:");
		palavra = tec.next();

		for (int i = palavra.length() - 1; i >= 0; i--) {
			palavraAoContrario = palavraAoContrario + palavra.charAt(i);
		}

		if (palavraAoContrario.equals(palavra)) {
			System.out.println("É palíndromo!");
		} else {
			System.out.println("Não é palíndromo!");
		}

	}

}
