import java.util.Scanner;

public class exerc5 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		Integer Hnormal;
		Integer Hextra;
		double normal;
		double extra;
		double total;

		System.out.println("Informe as horas normais trabalhadas nessa semana:");
		Hnormal = tec.nextInt();

		System.out.println("Informe as horas extras trabalhadas nessa semana:");
		Hextra = tec.nextInt();

		normal = Hnormal * 40;
		extra = (0.5 * normal) / Hextra;
		total = normal + extra;

		System.out.println("Vc trabalhou " + Hnormal + " horas normais, mais " + Hextra + " horas extra, recebendo R$"
				+ extra + " no seu salario mais R$" + normal + " do normal, totalizando R$" + total);
	}
}
