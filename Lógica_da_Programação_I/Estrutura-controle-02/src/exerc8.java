import java.util.Scanner;

public class exerc8 {
public static void main(String[] args) {
	Scanner tec = new Scanner(System.in);
	
	String nome1;
	String nome2;
	Integer idade1;
	Integer idade2;
	Integer dif;
	
	System.out.println("Informe o primeiro nome:");
	nome1 = tec.next();
	
	System.out.println("Informe o segundo nome:");
	nome2 = tec.next();
	
	System.out.println("Informe a primeira idade:");
	idade1 = tec.nextInt();
	
	System.out.println("Informe a segunda idade:");
	idade2 = tec.nextInt();
	
	if (idade1 > idade2) {
		dif = idade1 - idade2;
		System.out.println(nome1 + " é " + dif + " anos mais velho(a) que " + nome2);
	} else if (idade1 < idade2) {
		dif = idade2 - idade1;
		System.out.println(nome2 + " é " + dif + " anos mais velho(a) que " + nome1);
	} else {
		System.out.println("Ambos possuem a mesma idade!");
	}
}
}
