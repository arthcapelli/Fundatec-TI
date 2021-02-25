
public class MainCarro {

	public static void main(String[] args) {
		Carro carro1 = new Carro("Gol", "Spin", 2018, "Preto", "109384389", 200, 6, 0, 0, 0, 0, 0);

		carro1.acelera();

		System.out.println("------------------------------");

		carro1.aumentaMarcha();

		System.out.println("------------------------------");

		carro1.diminuiMarcha();

		carro1.imprimirDados();

	}

}
