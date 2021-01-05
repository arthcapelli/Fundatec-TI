import java.util.Scanner;

public class exerc3 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		Integer cons;
		double KWH;
		double custo;

		System.out.println("Digite o código do consumidor:");
		cons = tec.nextInt();

		System.out.println("Digite a quantidade de kWh consumidos no mês:");
		KWH = tec.nextDouble();

		if (cons == 1) {
			custo = KWH * 0.3;
			System.out.println("Consumidor do tipo Residencial, consumiu R$" + custo + " de luz nesse mês.");
		} else if (cons == 2) {
			custo = KWH * 0.5;
			System.out.println("Consumidor do tipo Comercial, consumiu R$" + custo + " de luz nesse mês.");
		} else if (cons == 3) {
			custo = KWH * 0.7;
			System.out.println("Consumidor do tipo Industrial, consumiu R$" + custo + " de luz nesse mês.");
		} else {
			System.out.println("O código digitado está incorreto!");
		}
	}
}
