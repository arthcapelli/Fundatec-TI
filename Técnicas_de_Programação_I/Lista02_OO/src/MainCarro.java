import java.util.Scanner;

public class MainCarro {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		carro1.setMarca("Gol");
		carro1.setModelo("Spin");
		carro1.setAno(2018);
		carro1.setCor("Preto");
		carro1.setChassi("109384389");
		carro1.setVelocidadeMaxima(200);
		carro1.setNumeroMarchas(6);
		int velocidade = 0;
		int vezesAcelerar = 0;
		int marcha = 0;
		int vezesAumenta = 0;
		int vezesDiminui = 0;

		Scanner tec = new Scanner(System.in);

		System.out.println("Insira a velocidade atual para acelerar:");
		velocidade = tec.nextInt();
		System.out.println("Insira quantas vezes deseja acelerar:");
		vezesAcelerar = tec.nextInt();
		carro1.acelera(velocidade, vezesAcelerar);

		System.out.println("------------------------------");

		System.out.println("Insira a marcha atual para aumentar:");
		marcha = tec.nextInt();
		System.out.println("Insira quantas vezes deseja aumentar a marcha:");
		vezesAumenta = tec.nextInt();
		carro1.aumentaMarcha(marcha, vezesAumenta);

		System.out.println("------------------------------");

		System.out.println("Insira a marcha atual para diminuir:");
		marcha = tec.nextInt();
		System.out.println("Insira quantas vezes deseja diminuir a marcha:");
		vezesDiminui = tec.nextInt();
		carro1.diminuiMarcha(marcha, vezesDiminui);

		System.out.println("------------------------------");
		System.out.println("Marca: " + carro1.getMarca());
		System.out.println("Modelo: " + carro1.getModelo());
		System.out.println("Ano: " + carro1.getAno());
		System.out.println("Cor: " + carro1.getCor());
		System.out.println("Chassi: " + carro1.getChassi());
		System.out.println("Velocidade máxima: " + carro1.getVelocidadeMaxima());
		System.out.println("Número de marchas: " + carro1.getNumeroMarchas());

	}

}
