import java.util.Scanner;

public class Exerc5 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double maior = 0;
		double menor = 0;
		double mediaF;
		double somaF = 0;
		double contF = 0;
		double mediaPop;
		double somaPop = 0;
		double contPop = 0;
		double percM;
		double contM = 0;
		double altura;
		String sexo;

		for (int i = 0; i < 50; i++) {
			System.out.println("Insira a altura:");
			altura = tec.nextDouble();
			if (i == 0) {
				maior = altura;
				menor = altura;
			}
			if (altura > maior) {
				maior = altura;
			}
			if (altura < menor) {
				menor = altura;
			}
			somaPop += altura;
			contPop++;

			System.out.println("Insira o sexo:");
			sexo = tec.next();

			if (sexo.equals("F")) {
				somaF += altura;
				contF++;
			}

			if (sexo.equals("M")) {
				contM++;
			}
		}

		System.out.println("A maior altura foi: " + maior);
		System.out.println("A menor altura foi: " + menor);

		mediaF = somaF / contF;
		System.out.println("A média de altura das mulheres é: " + mediaF);

		mediaPop = somaPop / contPop;
		System.out.println("A média de altura da população é: " + mediaPop);

		percM = (contM * 100) / contPop;
		System.out.println("O percentual de homens é: " + percM);
	}
}
