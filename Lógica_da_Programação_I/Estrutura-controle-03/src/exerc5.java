import java.util.Scanner;

public class exerc5 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		String conta;
		double saldo;
		double deb;
		double cred;
		double saldoAtual;

		System.out.println("Insira sua conta:");
		conta = tec.next();

		System.out.println("Insira seu saldo:");
		saldo = tec.nextDouble();

		System.out.println("Insira seu d�bito:");
		deb = tec.nextDouble();

		System.out.println("Insira seu cr�dito:");
		cred = tec.nextDouble();

		saldoAtual = saldo + cred - deb;

		if (saldoAtual >= 0) {
			System.out.println("Saldo positivo de: R$" + saldoAtual);
		} else {
			System.out.println("Saldo negativo!");
		}

	}
}
