import java.util.Scanner;

public class exerc2 {
	public static void main(String[] args) {

		double joao = 1.37;
		double pedro = 1.2;
		Integer meses = 0;

		while (pedro <= joao) {
			pedro += 0.03;
			joao += 0.02;
			meses++;
		}
		System.out.println("Pedro tem " + pedro + " metros de altura.");
		System.out.println("João tem " + joao + " metros de altura.");
		System.out.println("Pedro demorou " + meses + " meses para ficar mais alto que João");
	}
}
