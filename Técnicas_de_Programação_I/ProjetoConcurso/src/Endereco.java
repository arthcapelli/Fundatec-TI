
public class Endereco {

	private String rua;
	private int numero;
	private String bairro;
	private String complemento;
	private String cep;
	private Cidade cidade;

	public String getRua() {
		return rua;
	}

	public int getNumero() {
		return numero;
	}

	public String getBairro() {
		return bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getCep() {
		return cep;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public Endereco(String rua, int numero, String bairro, String complemento, String cep, Cidade cidade) {
		
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cep = cep;
		this.cidade = cidade;
	}

}