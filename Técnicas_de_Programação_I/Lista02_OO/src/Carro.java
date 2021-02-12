
public class Carro {

	private String marca;
	private String modelo;
	private int ano;
	private String cor;
	private String chassi;
	private int velocidadeMaxima;
	private int numeroMarchas;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public int getNumeroMarchas() {
		return numeroMarchas;
	}

	public void setNumeroMarchas(int numeroMarchas) {
		this.numeroMarchas = numeroMarchas;
	}

	public void acelera(int velocidade, int vezesAcelerar) {
		for (int i = 0; i < vezesAcelerar; i++) {
			velocidade = velocidade + 1;
			if (velocidade >= velocidadeMaxima) {
				System.out.println("Velocidade máxima de " + velocidadeMaxima + "km/h, atingida!");
				break;
			} else {
				System.out.println("Velocidade atual: " + velocidade + "km/h.");
			}
		}
	}

	public void aumentaMarcha(int marchaAtual, int vezesAumenta) {
		for (int i = 0; i < vezesAumenta; i++) {
			marchaAtual = marchaAtual + 1;
			if (marchaAtual >= numeroMarchas) {
				System.out.println("Marcha máxima de " + numeroMarchas + " atingida!");
				break;
			} else {
				System.out.println("Marcha atual: " + marchaAtual);
			}
		}
	}

	public void diminuiMarcha(int marchaAtual, int vezesDiminui) {
		for (int i = 0; i < vezesDiminui; i++) {
			marchaAtual = marchaAtual - 1;
			if (marchaAtual <= 1) {
				System.out.println("Primeira marcha atingida, não pode diminuir mais!");
				break;
			} else {
				System.out.println("Marcha atual: " + marchaAtual);
			}
		}
	}

}
