import java.util.Scanner;

public class exerc6 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double num1;
		double num2;
		double dif;

		System.out.println("Insira o primeiro numero:");
		num1 = tec.nextDouble();

		System.out.println("Insira o segundo numero:");
		num2 = tec.nextDouble();

		if (num1 > num2) {
			dif = num1 - num2;
			if (dif > 1000) {
				System.out.println("A diferença é maior que 1000!");
			} else {
				System.out.println("A diferença é menor que 1000!");
			}
			if (dif % 2 == 0) {
				System.out.println("A diferença é par!");
			} else {
				System.out.println("A difrença é impar!");
			}
		} else {
			dif = num2 - num1;
			if (dif > 1000) {
				System.out.println("A diferença é maior que 1000!");
			} else {
				System.out.println("A diferença é menor que 1000!");
			}
			if (dif % 2 == 0) {
				System.out.println("A diferença é par!");
			} else {
				System.out.println("A difrença é impar!");
			}
		}

	}
}
