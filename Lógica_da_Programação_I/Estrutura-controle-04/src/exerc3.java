import java.util.Scanner;

public class exerc3 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		Integer cons;
		double KWH;
		double custo;

		System.out.println("Digite o c�digo do consumidor:");
		cons = tec.nextInt();

		System.out.println("Digite a quantidade de kWh consumidos no m�s:");
		KWH = tec.nextDouble();

		if (cons == 1) {
			custo = KWH * 0.3;
			System.out.println("Consumidor do tipo Residencial, consumiu R$" + custo + " de luz nesse m�s.");
		} else if (cons == 2) {
			custo = KWH * 0.5;
			System.out.println("Consumidor do tipo Comercial, consumiu R$" + custo + " de luz nesse m�s.");
		} else if (cons == 3) {
			custo = KWH * 0.7;
			System.out.println("Consumidor do tipo Industrial, consumiu R$" + custo + " de luz nesse m�s.");
		} else {
			System.out.println("O c�digo digitado est� incorreto!");
		}
	}
}
