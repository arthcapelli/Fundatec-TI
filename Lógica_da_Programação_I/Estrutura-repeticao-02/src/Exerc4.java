import java.util.Scanner;

public class Exerc4 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int idade;
		String sexo;
		double salario;
		double media;
		double soma = 0;
		double cont = 0;
		int cont2 = 0;
		int maior = 0;
		int menor = 0;

		for (int i = 0; i < 300; i++) {
			System.out.println("Digite a idade:");
			idade = tec.nextInt();
			if (i == 0) {
				maior = idade;
				menor = idade;
			}
			if (idade > maior) {
				maior = idade;
			}
			if (idade < menor) {
				menor = idade;
			}

			System.out.println("Digite o sexo (M/F):");
			sexo = tec.next();

			System.out.println("Digite o salário:");
			salario = tec.nextDouble();
			soma += salario;
			cont++;

			if (sexo.equals("F") && salario <= 200) {
				cont2++;
			}
		}
		media = soma / cont;
		System.out.println("A média de salários é: " + media);
		System.out.println("A maior idade é: " + maior);
		System.out.println("A menor idade é: " + menor);
		System.out.println("A quantidade de mulheres com salário até R$200 é: " + cont2);
	}
}
