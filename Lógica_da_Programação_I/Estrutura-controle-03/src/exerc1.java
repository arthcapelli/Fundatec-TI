import java.util.Scanner;

public class exerc1 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		Integer apple;
		double custo;

		System.out.println("Informe a quantidade de maçãs:");
		apple = tec.nextInt();

		if (apple < 12 && apple > 0) {
			custo = apple * 1.30;
			System.out.println("O custo total foi de R$" + custo);
		} else if (apple >= 12) {
			custo = apple * 1;
			System.out.println("O custo total foi de R$" + custo);
		} else {
			System.out.println("Vc não comprou maçãs!");
		}

	}
}
