import java.util.Scanner;

public class exerc2 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		String sexo;
		Integer anos;
		double salario;
		double bonus;

		System.out.println("Informe o sexo do(a) funcion�rio(a):");
		sexo = tec.next();

		System.out.println("Informe quantos anos est� na empresa:");
		anos = tec.nextInt();

		System.out.println("Informe o sal�rio:");
		salario = tec.nextDouble();

		if (sexo.equals("Feminino") && anos >= 10) {
			bonus = salario * 0.25;
			salario = salario + bonus;
			System.out.println("Parab�ns, por ser do sexo feminino e ter 10 anos ou mais de empresa, recebeu R$" + bonus
					+ " de bonus natalino no salario. Agora ele � de R$" + salario);
		} else if (sexo.equals("Masculino") && anos >= 15) {
			bonus = salario * 0.2;
			salario = salario + bonus;
			System.out.println("Parab�ns, por ser do sexo masculino e ter 15 anos ou mais de empresa, recebeu R$"
					+ bonus + " de bonus natalino no salario. Agora ele � de R$" + salario);
		} else {
			bonus = 5000;
			salario = salario + bonus;
			System.out.println("Vc se encaixa no terceiro grupo, portanto recebe o bonus fixo de R$" + bonus
					+ ", seu salario foi e R$" + salario);
		}
	}
}
