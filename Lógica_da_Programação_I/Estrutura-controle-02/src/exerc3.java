import java.util.Scanner;

public class exerc3 {
public static void main(String[] args) {
	Scanner tec = new Scanner(System.in);
	
	Integer idade;
	
	System.out.println("Insira uma idade:");
	idade = tec.nextInt();
	
	if(idade >= 60) {
		System.out.println("A idade de " + idade + " anos é terceira idade!");
	} else if (idade >= 18 && idade <= 59) {
		System.out.println("A idade de " + idade + " anos é adulto!");
	} else if (idade >= 15 && idade <= 17) {
		System.out.println("A idade de " + idade + " anos é juvenil!");
	} else if (idade >= 10 && idade <= 14) {
		System.out.println("A idade de " + idade + " anos é infantil!");
	}
}
}
