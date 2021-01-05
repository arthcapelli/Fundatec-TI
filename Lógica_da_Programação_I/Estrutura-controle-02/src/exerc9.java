import java.util.Scanner;

public class exerc9 {
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
	
	if (num3 > num1 && num3 < num2) {
		System.out.println("O numero " + num3 + " está entre " + num1 + " e " + num2);
	} else {
		System.out.println("O numero " + num3 + " não está entre " + num1 + " e " + num2);
	}
}
}
