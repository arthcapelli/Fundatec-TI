import java.util.Scanner;

public class exerc1 {
public static void main(String[] args) {
	Scanner tec = new Scanner(System.in);
	
	Integer num;
	
	System.out.println("Informe um número inteiro:");
	num = tec.nextInt();
	
	if (num % 3 == 0) {
		System.out.println("O número é múltiplo de 3!");
	} else {
		System.out.println("O número não é múltiplo de 3!");
	}
}
}
