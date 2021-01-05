import java.util.Scanner;

public class exerc5 {
public static void main(String[] args) {
	Scanner tec = new Scanner(System.in);
	
	double num1;
	double num2;
	char option;
	double opA;
	double opB;
	double opC;
	
	System.out.println("Insira o primeiro numero:");
	num1 = tec.nextDouble();
	
	System.out.println("Insira o segundo numero:");
	num2 = tec.nextDouble();
	
	System.out.println("Insira a opção desejada:");
	option = tec.next().charAt(0);
	
	if (option == 'a') {
		opA = num1 + (2*num2);
		System.out.println("O primeiro número mais o dobro do segundo é: " + opA);
		
	} else if (option == 'b') {
		opB = num1*0.25;
		System.out.println("25% do primeiro valor é: " + opB);
		
	} else if (option == 'c') {
		opC = num2 + (num2*0.2);
		System.out.println("O segundo valor aumentado 20% é: " + opC);
		
	} else {
		System.out.println("A opção escolhida é inválida!");
	}
}
}
