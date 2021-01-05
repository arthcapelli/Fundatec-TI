import java.util.Scanner;

public class exerc4 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double salario;
		double vendas;
		double bonus;

		System.out.println("Salario:");
		salario = tec.nextDouble();

		System.out.println("Vendas:");
		vendas = tec.nextDouble();

		if (vendas <= 1500) {
			salario = salario + (vendas * 0.03);
			System.out.println("Vc vendeu até 1500, então seu salário é: " + salario);
		} else {
			bonus = (vendas - 1500) * 0.05;
			salario = salario + bonus + (1500 * 0.03);
			System.out.println("Vc vendeu mais de 1500, então seu salário é: " + salario);
		}
	}
}
