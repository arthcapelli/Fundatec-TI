import java.util.Scanner;

public class exerc5 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double raio;
		double area = 0;

		System.out.println("Informe o raio de um círculo:");
		raio = tec.nextDouble();
		
		while (raio >= 0) {
			area = (2 * 3.14) * raio;
			System.out.println("A área do círculo é: " + area);
			System.out.println("Informe o raio de um círculo:");
			raio = tec.nextDouble();
		}
	}
}
