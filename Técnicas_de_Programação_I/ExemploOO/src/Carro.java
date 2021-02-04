
public class Carro {

	private String cor;
	private int volumePortaMalas;
	private double potenciaMotor;
	private int numeroPortas;
	private int capacidadeCombustivel;
	private Marca marca;

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getVolumePortaMalas() {
		return volumePortaMalas;
	}

	public void setVolumePortaMalas(int volumePortaMalas) {
		this.volumePortaMalas = volumePortaMalas;
	}

	public double getPotenciaMotor() {
		return potenciaMotor;
	}

	public void setPotenciaMotor(double potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}

	public int getNumeroPortas() {
		return numeroPortas;
	}

	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}

	public int getCapacidadeCombustivel() {
		return capacidadeCombustivel;
	}

	public void setCapacidadeCombustivel(int capacidadeCombustivel) {
		this.capacidadeCombustivel = capacidadeCombustivel;
	}

}
