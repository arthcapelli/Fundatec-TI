import java.util.Scanner;

public class exer12 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		String nome;
		double diaria;
		double contaD;

		System.out.println("Insira o nome do cliente:");
		nome = tec.next();

		System.out.println("Insira a quantidade de di�rias:");
		diaria = tec.nextDouble();
		contaD = diaria * 60;

		if (diaria > 15) {
			contaD = contaD + (5.5 * diaria);
			System.out.println("O(a) cliente " + nome + ", ficou mais de 15 dias e o total da conta foi R$" + contaD);
		} else if (diaria == 15) {
			contaD = contaD + (6 * diaria);
			System.out.println("O(a) cliente " + nome + ", ficou 15 dias e o total da conta foi R$" + contaD);
		} else {
			contaD = contaD + (8 * diaria);
			System.out.println("O(a) cliente " + nome + ", ficou menos de 15 dias e o total da conta foi R$" + contaD);
		}
	}
}
