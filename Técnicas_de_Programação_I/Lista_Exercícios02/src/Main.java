import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		double velocidade = 0;
		double vezesAcelerar = 0;
		double vezesDesacelerar = 0;

		Scanner tec = new Scanner(System.in);

		String tipo1 = "tipo01";
		Tipo tipo = new Tipo(tipo1);

		String modelo1 = "modelo01";
		Modelo modelo = new Modelo(modelo1);

		String origem = "Porto Alegre";
		String destino = "Estados Unidos";
		Navegacao navegacao = new Navegacao(origem, destino);

		String nome = "Shalala";
		int anoFabricacao = 2020;
		double velocidadeMaxima = 10.0;
		double potencia = 150.0;
		double largura = 50.0;
		double comprimento = 100.0;
		double capacidadeCarga = 200.0;

		Container container01 = new Container(50.0);
		Container container02 = new Container(50.0);
		Container container03 = new Container(50.0);
		Container container04 = new Container(150.0);

		List<Container> containers = new ArrayList<Container>();
		containers.add(container01);
		containers.add(container02);

		Navio navio = new Navio(tipo, modelo, navegacao, nome, anoFabricacao, velocidadeMaxima, potencia, largura,
				comprimento, capacidadeCarga, containers);

		System.out.println("Insira a velocidade atual para acelerar:");
		velocidade = tec.nextDouble();
		System.out.println("Insira quantas vezes deseja acelerar:");
		vezesAcelerar = tec.nextDouble();

		navio.acelera(velocidade, vezesAcelerar);
		System.out.println("---------------------------");

		System.out.println("Insira a velocidade atual para desacelerar:");
		velocidade = tec.nextDouble();
		System.out.println("Insira quantas vezes deseja desacelerar:");
		vezesDesacelerar = tec.nextDouble();

		navio.desacelera(velocidade, vezesDesacelerar);
		System.out.println("---------------------------");

		System.out.println("**Adicionando 50 toneladas**");
		navio.adicionarCarga(container03);
		System.out.println("**Tentando adicionar mais 150 toneladas**");
		navio.adicionarCarga(container04);

		System.out.println("---------------------------");
		System.out.println("**Removendo 50 toneladas**");
		navio.removerCarga(container01);

	}

}
