import java.util.Scanner;

public class exerc7 {
public static void main(String[] args) {
	Scanner tec = new Scanner(System.in);
	
	Integer num;
	
	System.out.println("Digite um numero inteiro:");
	num = tec.nextInt();
	
	if (num > 10) {
		System.out.println("O numero " + num + " é maior que 10!");
	} else {
		System.out.println("O numero " + num + " é menor que 10!");
	}
}
}
