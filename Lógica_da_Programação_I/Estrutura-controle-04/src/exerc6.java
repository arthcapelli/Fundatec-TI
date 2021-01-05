import java.util.Scanner;

public class exerc6 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		Integer carrosV;
		double vendas;
		double salario;
		double comissao;
		double salarioF;

		System.out.println("Informe quantos carros vc vendeu:");
		carrosV = tec.nextInt();

		System.out.println("Insira a comissão por carro vendido:");
		comissao = tec.nextDouble();
		comissao = carrosV * comissao;

		System.out.println("Insira o valor total das vendas efetuadas:");
		vendas = tec.nextDouble();
		vendas = vendas * 0.05;

		System.out.println("Informe seu salario:");
		salario = tec.nextDouble();

		salarioF = comissao + vendas + salario;

		System.out.println("Vc vendeu " + carrosV + " carros, recebendo R$" + comissao + " de comissão, mais R$"
				+ vendas + " sobre o total de vendas, somado com R$" + salario + " de seu salario fixo, totalizando R$"
				+ salarioF + " de salário final.");
	}
}
