import java.util.Scanner;

public class exerc7 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int idade;

		System.out.println("Informe uma idade:");
		idade = tec.nextInt();

		while (idade >= 0) {
			if (idade < 16) {
				System.out.println("Não votante!");
			}
			if (idade >= 16 && idade < 18 || idade > 65) {
				System.out.println("Eleitor facultativo!");
			}
			if (idade >= 18 && idade <= 65) {
				System.out.println("Eleitor obrigatório!");
			}
			System.out.println("Informe uma idade:");
			idade = tec.nextInt();

		}
	}
}
