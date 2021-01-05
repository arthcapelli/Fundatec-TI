import java.util.Scanner;

public class exerc7 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		String cargo;
		double salario;
		double horas;

		System.out.println("Informe seu cargo:");
		cargo = tec.next();

		System.out.println("Informe seu salario fixo:");
		salario = tec.nextDouble();

		System.out.println("Informe as horas extras trabalhadas:");
		horas = tec.nextDouble();

		if (cargo.equals("Gerente")) {
			salario = salario + (horas * 15);
			System.out.println("Vc é Gerente e trabalhou " + horas + " horas extras, seu salario é R$" + salario);
		} else if (cargo.equals("Desenvolvedor") || cargo.equals("Testador")) {
			salario = salario + (horas * 8);
			System.out.println("Vc é Desenvolvedor ou Testador e trabalhou " + horas + " horas extras, seu salario é R$"
					+ salario);
		} else if (cargo.equals("Analista")) {
			salario = salario + (horas * 12);
			System.out.println("Vc é Analista e trabalhou " + horas + " horas extras, seu salario é R$" + salario);
		} else {
			salario = salario + (horas * 5);
			System.out.println("Vc se encaixa nos demais cargos e trabalhou " + horas
					+ " horas extras, seu salario é R$" + salario);
		}
	}
}
