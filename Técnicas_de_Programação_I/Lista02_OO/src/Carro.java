import java.util.Scanner;

public class Carro {
	Scanner tec = new Scanner(System.in);
	private String marca;
	private String modelo;
	private int ano;
	private String cor;
	private String chassi;
	private int velocidadeMaxima;
	private int numeroMarchas;
	private int velocidade = 0;
	private int vezesAcelerar = 0;
	private int marcha = 0;
	private int vezesAumenta = 0;
	private int vezesDiminui = 0;

	public Carro(String marca, String modelo, int ano, String cor, String chassi, int velocidadeMaxima,
			int numeroMarchas, int velocidade, int vezesAcelerar, int marcha, int vezesAumenta, int vezesDiminui) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.chassi = chassi;
		this.velocidadeMaxima = velocidadeMaxima;
		this.numeroMarchas = numeroMarchas;
		this.velocidade = velocidade;
		this.vezesAcelerar = vezesAcelerar;
		this.marcha = marcha;
		this.vezesAumenta = vezesAumenta;
		this.vezesDiminui = vezesDiminui;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAno() {
		return ano;
	}

	public String getCor() {
		return cor;
	}

	public String getChassi() {
		return chassi;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public int getNumeroMarchas() {
		return numeroMarchas;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public int getVezesAcelerar() {
		return vezesAcelerar;
	}

	public int getMarcha() {
		return marcha;
	}

	public int getVezesAumenta() {
		return vezesAumenta;
	}

	public int getVezesDiminui() {
		return vezesDiminui;
	}

	public void acelera() {
		System.out.println("Insira a velocidade atual para acelerar:");
		this.velocidade = tec.nextInt();
		System.out.println("Insira quantas vezes deseja acelerar:");
		this.vezesAcelerar = tec.nextInt();

		for (int i = 0; i < this.vezesAcelerar; i++) {
			this.velocidade = this.velocidade + 1;
			if (this.velocidade >= this.velocidadeMaxima) {
				System.out.println("Velocidade máxima de " + this.velocidadeMaxima + "km/h, atingida!");
				break;
			} else {
				System.out.println("Velocidade atual: " + this.velocidade + "km/h.");
			}
		}
	}

	public void aumentaMarcha() {
		System.out.println("Insira a marcha atual para aumentar:");
		this.marcha = tec.nextInt();
		System.out.println("Insira quantas vezes deseja aumentar a marcha:");
		this.vezesAumenta = tec.nextInt();

		for (int i = 0; i < this.vezesAumenta; i++) {
			this.marcha = this.marcha + 1;
			if (this.marcha >= this.numeroMarchas) {
				System.out.println("Marcha máxima de " + this.numeroMarchas + " atingida!");
				break;
			} else {
				System.out.println("Marcha atual: " + this.marcha);
			}
		}
	}

	public void diminuiMarcha() {
		System.out.println("Insira a marcha atual para diminuir:");
		this.marcha = tec.nextInt();
		System.out.println("Insira quantas vezes deseja diminuir a marcha:");
		this.vezesDiminui = tec.nextInt();

		for (int i = 0; i < this.vezesDiminui; i++) {
			this.marcha = this.marcha - 1;
			if (this.marcha <= 1) {
				System.out.println("Primeira marcha atingida, não pode diminuir mais!");
				break;
			} else {
				System.out.println("Marcha atual: " + this.marcha);
			}
		}
	}

	public void imprimirDados() {
		System.out.println("------------------------------");
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ano: " + this.ano);
		System.out.println("Cor: " + this.cor);
		System.out.println("Chassi: " + this.chassi);
		System.out.println("Velocidade máxima: " + this.velocidadeMaxima);
		System.out.println("Número de marchas: " + this.numeroMarchas);
	}

}
