import java.util.Scanner;

public class exerc2 {
public static void main(String[] args) {
	Scanner tec = new Scanner(System.in);
	
	Integer nasc;
	Integer atual;
	Integer dif;
	
	System.out.println("Digite o seu ano e nascimento:");
	nasc = tec.nextInt();
	
	System.out.println("Digite o ano atual:");
	atual = tec.nextInt();
	
	dif = atual - nasc;
	
	if (dif >= 16) {
		System.out.println("Vc tem "+ dif + " anos e pode votar esse ano!");
	} else {
		System.out.println("Vc tem " + dif +" anos e não pode votar");
	}
}
}
