import java.util.Scanner;

public class exerc4 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double reais;
		String moeda;
		double cambio;
		double taxa;
		double total;

		System.out.println("Informe a quantidade, em Reais, que deseja trocar:");
		reais = tec.nextDouble();

		System.out.println("Informe a moeda desejada:");
		moeda = tec.next();

		System.out.println("Informe a porcentagem de taxa de cambio:");
		taxa = tec.nextDouble();
		taxa = taxa / 100;
		taxa = reais * taxa;

		total = reais - taxa;

		if (moeda.equals("Dolar")) {
			cambio = total / 5.13;
			System.out.println("R$" + reais + ", menos R$" + taxa + " equivalem a R$" + total
					+ ", convertidos para Dólar, ficam " + cambio + " Dólares.");
		} else if (moeda.equals("Euro")) {
			cambio = total / 6.23;
			System.out.println("R$" + reais + ", menos R$" + taxa + " equivalem a R$" + total
					+ ", convertidos para Euro, ficam " + cambio + " Euros.");
		} else if (moeda.equals("Libras")) {
			cambio = total / 6.89;
			System.out.println("R$" + reais + ", menos R$" + taxa + " equivalem a R$" + total
					+ ", convertidos para Libras, ficam " + cambio + " Libras.");
		} else {
			System.out.println("Não trabalhamos com a moeda inserida ou ela não é válida.");
		}
	}
}
