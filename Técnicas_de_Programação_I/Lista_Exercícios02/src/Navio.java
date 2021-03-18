import java.util.ArrayList;
import java.util.List;

public class Navio {
	private Tipo tipo;
	private Modelo modelo;
	private Navegacao navegacao;
	private String nome;
	private int anoFabricacao;
	private double velocidadeMaxima;
	private double potencia;
	private double largura;
	private double comprimento;
	private double capacidadeCarga;
	private List<Container> containers = new ArrayList<Container>();

	public Tipo getTipo() {
		return tipo;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public Navegacao getNavegacao() {
		return navegacao;
	}

	public String getNome() {
		return nome;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public double getPotencia() {
		return potencia;
	}

	public double getLargura() {
		return largura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public List<Container> getContainers() {
		return containers;
	}

	public Navio(Tipo tipo, Modelo modelo, Navegacao navegacao, String nome, int anoFabricacao, double velocidadeMaxima,
			double potencia, double largura, double comprimento, double capacidadeCarga, List<Container> containers) {

		this.tipo = tipo;
		this.modelo = modelo;
		this.navegacao = navegacao;
		this.nome = nome;
		this.anoFabricacao = anoFabricacao;
		this.velocidadeMaxima = velocidadeMaxima;
		this.potencia = potencia;
		this.largura = largura;
		this.comprimento = comprimento;
		this.capacidadeCarga = capacidadeCarga;
		this.containers = containers;
	}

	public void acelera(double velocidade, double vezesAcelerar) {
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

	public void desacelera(double velocidade, double vezesDesacelerar) {
		double velocidadeMinima = 0;
		for (int i = 0; i < vezesDesacelerar; i++) {
			velocidade = velocidade - 1;
			if (velocidade <= velocidadeMinima) {
				System.out.println("Velocidade mínima de " + velocidadeMinima + "km/h, atingida!");
				break;
			} else {
				System.out.println("Velocidade atual: " + velocidade + "km/h.");
			}
		}
	}

	public void adicionarCarga(Container container) {
		System.out.println("Peso antigo: " + pesoAtual());
		boolean podeAdicionar = validarAdicaoCarga(container);
		if (podeAdicionar) {
			containers.add(container);
			System.out.println("Peso atual: " + pesoAtual());
			return;
		}
		System.out.println("Adicionar este container excederá a carga máxima de " + this.capacidadeCarga);
	}

	private boolean validarAdicaoCarga(Container containerAdicao) {
		double cargaAtual = pesoAtual();
		if ((containerAdicao.getPeso() + cargaAtual) > this.capacidadeCarga) {
			return false;
		}
		return true;
	}

	private double pesoAtual() {
		double cargaAtual = 0;
		for (Container containerLoop : containers) {
			cargaAtual = cargaAtual + containerLoop.getPeso();
		}
		return cargaAtual;
	}

	public void removerCarga(Container container) {
		System.out.println("Peso antigo: " + pesoAtual());
		containers.remove(container);
		System.out.println("Peso atual: " + pesoAtual());

	}

}
