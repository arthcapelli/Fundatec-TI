import java.util.Scanner;

public class exerc11 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		Character categoria;
		String nome;
		double salario;

		System.out.println("Insira o nome do empregado");
		nome = tec.next();

		System.out.println("Insira a categoria do empregado:");
		categoria = tec.next().charAt(0);

		System.out.println("Insira o sal�rio do empregado:");
		salario = tec.nextDouble();

		if (categoria == 'A' || categoria == 'C' || categoria == 'F' || categoria == 'H') {
			salario = salario + (salario * 0.1);
			System.out.println(
					nome + " se encaixa na categoria que recebe 10% de aumento, seu novo salario � R$" + salario);
		} else if (categoria == 'B' || categoria == 'D' || categoria == 'E' || categoria == 'I' || categoria == 'J'
				|| categoria == 'T') {
			salario = salario + (salario * 0.15);
			System.out.println(
					nome + " se encaixa na categoria que recebe 15% de aumento, seu novo salario � R$" + salario);
		} else if (categoria == 'K' || categoria == 'R') {
			salario = salario + (salario * 0.25);
			System.out.println(
					nome + " se encaixa na categoria que recebe 25% de aumento, seu novo salario � R$" + salario);
		} else if (categoria == 'L' || categoria == 'M' || categoria == 'N' || categoria == 'O' || categoria == 'P'
				|| categoria == 'Q' || categoria == 'S') {
			salario = salario + (salario * 0.35);
			System.out.println(
					nome + " se encaixa na categoria que recebe 35% de aumento, seu novo salario � R$" + salario);
		} else if (categoria == 'U' || categoria == 'V' || categoria == 'X' || categoria == 'Y' || categoria == 'W'
				|| categoria == 'Z') {
			salario = salario + (salario * 0.5);
			System.out.println(
					nome + " se encaixa na categoria que recebe 50% de aumento, seu novo salario � R$" + salario);
		}
		{
		}
	}
}
