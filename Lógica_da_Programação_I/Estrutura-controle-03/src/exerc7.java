import java.util.Scanner;

public class exerc7 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double N;

		System.out.println("Insira um número");
		N = tec.nextDouble();

		if (N > 100) {
			System.out.println("F3");
			
		} else if (N > 10 && N <= 100) {
			System.out.println("F2");

		} else {
			System.out.println("F1");
		}
	}
}
