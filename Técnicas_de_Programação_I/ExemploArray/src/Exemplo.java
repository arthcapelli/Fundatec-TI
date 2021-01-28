import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		int valores[] = new int[10];

		// percorrendo e populando o array
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Informe valores:");
			valores[i] = tec.nextInt();

		}

		// percorrendo o array e efetuando a impressão
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Valores digitados: " + valores[i]);
		}

		// verificando números pares
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] % 2 == 0) {
				System.out.println("Número par: " + valores[i]);
			} else {
				System.out.println("Número é ímpar: " + valores[i]);
			}
		}
		
		//filtrar os positivos
		for (int i = 0; i < valores.length; i++) {
			if(valores[i]>0) {
				System.out.println("Valor positivo: " + valores[i]);
			} else {
				System.out.println("Valor negativo: " + valores[i]);
			}
		}

	}

}
