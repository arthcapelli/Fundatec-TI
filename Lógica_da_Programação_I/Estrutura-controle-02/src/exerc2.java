import java.util.Scanner;

public class exerc2 {
public static void main(String[] args) {
	Scanner tec = new Scanner(System.in);
	
	String nome;
	double n1;
	double n2;
	double n3;
	double media;
	
	System.out.println("Insira o nome o aluno:");
	nome = tec.next();
	
	System.out.println("Insira a primeira nota:");
	n1 = tec.nextDouble();
	
	System.out.println("Insira a segunda nota:");
	n2 = tec.nextDouble();
	
	System.out.println("Insira a terceira nota:");
	n3 = tec.nextDouble();
	
	media = (n1+n2+n3)/3;
	
	if(media >= 7 && media <= 10) {
		System.out.println("Aluno " + nome + " aprovado com media de: " + media);
	} else if (media >= 5.1 && media <= 6.9) {
		System.out.println("Aluno " + nome + " em recuperação com media de: " + media);
	} else if (media >= 0 && media <=5) {
		System.out.println("Aluno " + nome + " reprovado com media de: " + media);
	}else {
		System.out.println("A nota " + media + " é inválida!");
	}
}
}
