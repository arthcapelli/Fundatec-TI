import java.util.Scanner;

public class Exerc1 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		Integer num;
		Integer res;

		System.out.println("Insira um valor de 1 a 10:");
		num = tec.nextInt();

		for (int i = 0; i <= 10; i++) {
			res = num * i;
			System.out.println(num + " X " + i + " = " + res);
			//System.out.printf("%d x %d = %d", num, i, res);
		}
	}
}
