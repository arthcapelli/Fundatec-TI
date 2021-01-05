import java.util.Scanner;

public class exerc1 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		Integer codigo;
		Integer qnt;
		double total;
		String compra;

		System.out.println("Deseja comprar?");
		compra = tec.next();

		total = 0;

		for (int j = 0; compra.equals("Sim"); j++) {

			System.out.println("Informe o c�digo do produto:");
			codigo = tec.nextInt();

			System.out.println("Informe a quantidade desejada:");
			qnt = tec.nextInt();

			if (codigo == 1001) {
				total += (qnt * 5.32);
				System.out.println("R$" + total);
			}
			if (codigo == 1002) {
				total += (qnt * 63.89);
				System.out.println("R$" + total);
			}
			if (codigo == 1003) {
				total += (qnt * 9.87);
				System.out.println("R$" + total);
			}
			if (codigo == 1004) {
				total += (qnt * 53);
				System.out.println("R$" + total);
			}
			System.out.println("Deseja continuar comprando?");
			compra = tec.next();
		}
		System.out.println("O total comprado foi de R$" + total);
		/*
		 * if (codigo == 1001) { total = qnt * 5.32;
		 * System.out.println("Deseja continuar comprando?"); } if (codigo == 1002) {
		 * total = qnt * 63.89; System.out.println("Deseja continuar comprando?"); } if
		 * (codigo == 1003) { total = qnt * 9.87;
		 * System.out.println("Deseja continuar comprando?"); } if (codigo == 1004) {
		 * total = qnt * 53; System.out.println("Deseja continuar comprando?"); }
		 */
		/*
		 * System.out.println("Informe o c�digo do produto:"); codigo = tec.nextInt();
		 * 
		 * System.out.println("Informe a quantidade desejada:"); qnt = tec.nextInt();
		 */
	}

}
