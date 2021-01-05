import java.util.Scanner;

public class exerc10 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double parafuso;
		double porca;
		double arruela;
		double precoP;
		double precoPo;
		double precoA;
		double descP;
		double descPo;
		double descA;
		double totalDesc;
		double totalP;
		double totalPo;
		double totalA;
		double totalPagar;
		String nome;

		System.out.println("Insira o nome do cliente:");
		nome = tec.next();

		System.out.println("Qntd de parafuso:");
		parafuso = tec.nextDouble();
		System.out.println("Insira o pre�o de cada parafuso:");
		precoP = tec.nextDouble();
		totalP = parafuso * precoP;
		descP = totalP * 0.2;

		System.out.println("Qntd de porca:");
		porca = tec.nextDouble();
		System.out.println("Insira o pre�o de cada porca:");
		precoPo = tec.nextDouble();
		totalPo = porca * precoPo;
		descPo = totalPo * 0.1;

		System.out.println("Qntd de arruela:");
		arruela = tec.nextDouble();
		System.out.println("Insira o pre�o de cada arruela:");
		precoA = tec.nextDouble();
		totalA = arruela * precoA;
		descA = totalA * 0.3;

		totalDesc = descP + descPo + descA;
		totalPagar = (totalP + totalPo + totalA) - totalDesc;

		System.out.println("O cliente " + nome + " comprou " + parafuso + " parafuso(s), " + porca + " porca(s) e "
				+ arruela + " arruela(s)");
		System.out.println("O desconto total foi de: " + totalDesc + ", e o total a pagar �: " + totalPagar);
	}
}
