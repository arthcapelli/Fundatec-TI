import java.util.Scanner;

public class exemplo1 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int num;
		int res;

		System.out.println("Insira um numero inteiro:");
		num = tec.nextInt();

		// incremento
		for (int i = 0; i <= 10; i++) {
			res = num * i;
			System.out.println(num + " X " + i + " = " + res);
		}

		System.out.println("----------------------");

		// decremento
		for (int i = 10; i >= 0; i--) {
			res = num * i;
			System.out.println(num + " X " + i + " = " + res);
		}
	}
}
