
public class Produto {
	private String nome;
	private String descricao;
	private double valor;

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}

	public Produto(String nome, String descricao, double valor) {
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
	}

}
