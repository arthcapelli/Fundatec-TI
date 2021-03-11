import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
	private List<Candidato> candidatos = new ArrayList<Candidato>();
	private List<Prova> provas = new ArrayList<Prova>();

	public void adicionarProva(Prova prova) {
		provas.add(prova);
	}

	public List<Prova> getProvas() {
		return provas;
	}

	public List<Candidato> getCandidatos() {
		return candidatos;
	}

	public void adicionarCandidato(Candidato candidato) {
		boolean candidatoCadastrado = validarExistenciaCandidato(candidato);
		if (candidatoCadastrado) {
			System.out.println("O candidato já possui um cadastro!");
			return;
		}
		this.candidatos.add(candidato);
	}

	private boolean validarExistenciaCandidato(Candidato candidato) {
		Candidato candidatoEncontrado = filtrarCandidato(candidato.getCpf());
		if (candidatoEncontrado == null) {
			return false;
		}
		return true;
	}

	public Candidato filtrarCandidato(String cpf) {
		for (Candidato candidatoLoop : candidatos) {
			if (candidatoLoop.getCpf().equals(cpf)) {
				return candidatoLoop;
			}
		}
		return null;
	}

	public Prova filtrarProva(int idProva) {
		for (Prova provaLoop : provas) {
			if (provaLoop.getId() == idProva) {
				return provaLoop;
			}
		}
		return null;
	}

	public List<Prova> filtrarProvaData(LocalDateTime dataInicio, LocalDateTime dataFim) {
		List<Prova> provaPorData = new ArrayList<Prova>();
		for (Prova provaLoop : provas) {
			if (provaLoop.getData().isAfter(dataInicio) && provaLoop.getData().isBefore(dataFim)) {
				provaPorData.add(provaLoop);
			}

		}
		return provaPorData;
	}

	public List<Prova> filtrarProvaSalario(double salario) {
		List<Prova> provasPorSalario = new ArrayList<Prova>();
		for (Prova provaLoop : provas) {
			if (provaLoop.getSalarioBase() > salario) {
				provasPorSalario.add(provaLoop);
			}
		}
		return provasPorSalario;
	}

	public List<Prova> filtrarProvaCidade(String cidadeFiltro) {
		List<Prova> provasPorCidade = new ArrayList<Prova>();
		for (Prova provaLoop : provas) {
			if (provaLoop.getEndereco().getCidade().getNome().equals(cidadeFiltro)) {
				provasPorCidade.add(provaLoop);
			}
		}
		return provasPorCidade;
	}

	public List<Prova> filtrarProvaVagas(int vagasFiltro) {
		List<Prova> provasPorVagas = new ArrayList<Prova>();
		for (Prova provaLoop : provas) {
			if (provaLoop.getNumeroVagas() == vagasFiltro) {
				provasPorVagas.add(provaLoop);
			}
		}
		return provasPorVagas;
	}

	public void imprimirProva(BancoDeDados bancoDeDados) {
		for (Prova provaLoop : bancoDeDados.getProvas()) {
			System.out.println("*****Prova Cadastrada!******");
			System.out.println("ID: " + provaLoop.getId());
			System.out.println("Data: " + provaLoop.getData());
			System.out.println("Nome do Estado: " + provaLoop.getEndereco().getCidade().getEstado().getNome());
			System.out.println("Sigla do Estado: " + provaLoop.getEndereco().getCidade().getEstado().getSigla());
			System.out.println("Nome da Cidade: " + provaLoop.getEndereco().getCidade().getNome());
			System.out.println("Rua: " + provaLoop.getEndereco().getRua());
			System.out.println("Número: " + provaLoop.getEndereco().getNumero());
			System.out.println("Bairro: " + provaLoop.getEndereco().getBairro());
			System.out.println("Complemento: " + provaLoop.getEndereco().getComplemento());
			System.out.println("CEP: " + provaLoop.getEndereco().getCep());
			System.out.println("Vagas: " + provaLoop.getNumeroVagas());
			System.out.println("Descrição: " + provaLoop.getDescricao());
			System.out.println("Empresa: " + provaLoop.getEmpresa());
			System.out.println("Salário: " + provaLoop.getSalarioBase());
			System.out.println("---------------------------------------");
		}
	}

	public void imprimirCandidato(BancoDeDados bancoDeDados) {
		for (Candidato candidatoLoop : bancoDeDados.getCandidatos()) {
			System.out.println("*****Candidato cadastrado!*****");
			System.out.println("Nome do Candidato: " + candidatoLoop.getNome());
			System.out.println("CPF: " + candidatoLoop.getCpf());
			System.out.println("-------------------------------------");
		}
	}

}
