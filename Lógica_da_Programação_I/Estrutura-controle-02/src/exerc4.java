import java.util.Scanner;

public class exerc4 {
public static void main(String[] args) {
	Scanner tec = new Scanner(System.in);
	
	double num1;
	double num2;
	
	System.out.println("Insira o primeiro numero:");
	num1 = tec.nextDouble();
	
	System.out.println("Insira o segundo numero:");
	num2 = tec.nextDouble();
	
	if (num1 < num2) {
		System.out.println(num1 + " é menor que " + num2);
	} else {
		System.out.println(num2 + " é menor que " + num1);
	}
}
}
