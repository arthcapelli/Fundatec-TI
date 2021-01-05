import java.util.Scanner;

public class exerc1 {
public static void main(String[] args) {
	Scanner tec = new Scanner(System.in);
	
	Integer num;
	
	System.out.println("Insira um numero inteiro:");
	num = tec.nextInt();
	
	if (num < 0) {
		System.out.println("O numero é negativo!");
	}else {
		System.out.println("O numero é positivo!");
	}
}
}
