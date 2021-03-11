import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Prova {

	private int id;
	private LocalDateTime data;
	private Endereco endereco;
	private int numeroVagas;
	private String descricao;
	private String empresa;
	private double salarioBase;
	private List<Candidato> candidatos = new ArrayList<>();

	public int getId() {
		return id;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public int getNumeroVagas() {
		return numeroVagas;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getEmpresa() {
		return empresa;
	}

	public LocalDateTime getData() {
		return data;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public Prova(int id, LocalDateTime data, Endereco endereco, int numeroVagas, String descricao, String empresa,
			double salarioBase) {
		this.id = id;
		this.data = data;
		this.endereco = endereco;
		this.numeroVagas = numeroVagas;
		this.descricao = descricao;
		this.empresa = empresa;
		this.salarioBase = salarioBase;
	}

	public void inscreverCandidato(Candidato candidato) {
		boolean candidatoInscrito = validarInscricaoCandidato(candidato);
		if (candidatoInscrito) {
			System.out.println("O candidato já está inscrito para essa prova!");
			return;
		}

		this.candidatos.add(candidato);
	}

	private boolean validarInscricaoCandidato(Candidato candidatoParaInscricao) {
		for (Candidato candidatoInscrito : candidatos) {
			if (candidatoInscrito.getCpf().equals(candidatoParaInscricao.getCpf())) {
				return true;
			}
		}
		return false;
	}

}
