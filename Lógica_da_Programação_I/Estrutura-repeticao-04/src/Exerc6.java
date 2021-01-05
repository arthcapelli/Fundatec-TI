import java.util.Scanner;

public class Exerc6 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		String info;
		double contFamilia = 0;
		double filhos;
		double mediaFilhos = 0;
		double somaFilhos = 0;
		double rendaBruta;
		double mediaBruta = 0;
		double somaBruta = 0;
		double contSup = 0;
		double contFil = 0;

		System.out.println("Deseja inserir informa��es? (S/N)");
		info = tec.next();
		
		while (info.equals("S")) {
			System.out.println("Insira a quantidade de filhos");
			filhos = tec.nextDouble();
			if (filhos > 3) {
				contFil++;
			}
			somaFilhos += filhos;
			contFamilia++;

			System.out.println("Insira a renda bruta da familia:");
			rendaBruta = tec.nextDouble();
			somaBruta += rendaBruta;

			if (rendaBruta > 1800) {
				contSup++;
			}
			System.out.println("Deseja inserir mais informa��es? (S/N)");
			info = tec.next();
		}

		mediaFilhos = somaFilhos / contFamilia;
		System.out.println("A m�dia de filhos nas fam�lias �: " + mediaFilhos);

		mediaBruta = somaBruta / contFamilia;
		System.out.println("A m�dia de renda bruta nas fam�lias �: " + mediaBruta);

		System.out.println("A quantidade de fam�lias com renda bruta superior a R$1800 �: " + contSup);
		System.out.println("A quantidade de fam�lias com mais de 3 filhos �: " + contFil);
	}
}
