import java.util.Scanner;

public class exerc2 {
public static void main(String[] args) {
	Scanner tec = new Scanner(System.in);
	
	Integer num;
	
	System.out.println("Infome um número inteiro:");
	num = tec.nextInt();
	
	if(num > 100) {
		System.out.println("O número é maior que 100.");
	} else {
		System.out.println("O número não é maior que 100.");
	}
	
}
}
