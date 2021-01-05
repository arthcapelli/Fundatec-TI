import java.util.Scanner;

public class exerc3 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double num1;
		double num2;
		double num3;

		System.out.println("Informe o primeiro numero:");
		num1 = tec.nextDouble();

		System.out.println("Informe o segundo numero:");
		num2 = tec.nextDouble();

		System.out.println("Informe o terceiro numero:");
		num3 = tec.nextDouble();

		if (num1 > num2 && num1 > num3) {
			if (num2 > num3) {
				System.out.println(num3 + "  <  " + num2 + "  <  " + num1);
			} else {
				System.out.println(num2 + " < " + num3 + " < " + num1);
			}
		} else if (num2 > num1 && num2 > num3) {
			if (num1 > num3) {
				System.out.println(num3 + " < " + num1 + " < " + num2);
			} else {
				System.out.println(num1 + " < " + num3 + " < " + num2);
			}
		} else if (num3 > num1 && num3 > num2) {
			if (num1 > num2) {
				System.out.println(num2 + " < " + num1 + " < " + num3);
			} else {
				System.out.println(num1 + " < " + num2 + " < " + num3);
			}
		} else {
			System.out.println("Vc digitou valores iguais!");
		}
	}
}
