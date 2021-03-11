
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 1 - Cadastrar a prova
		// 2 - Cadastrar um candidato
		// 3 - Inscrever um candidato para uma determinada prova
		// 4 - Mostrar concursos com intervalos entre datas
		// Ex.: Os concursos entre 20/01/2020 - 28/01/2020
		// 5 - Mostrar os concursos com salarios maiores que um determinado valor
		// Ex.: O usuÃ¡rio informa R$ 2000,00 e o sistema mostra todos
		// os consursos que estÃ£o pagando acima deste valor
		// 6 - Mostrar os concursos de uma determinada cidade
		// Ex.: O usuÃ¡rio informa Porto Alegre e o sistema mostra todos
		// os consursos que sÃ£o desta cidade
		// 7 - Mostrar os concursos com um determinado numero de vagas
		// 8 - Sair

		Scanner tec = new Scanner(System.in);

		String opcao = "S";

		BancoDeDados bancoDeDados = new BancoDeDados();

		while (opcao.equals("S")) {

			System.out.println("Informe uma opcao do menu");
			System.out.println("1 - Cadastrar prova");
			System.out.println("2 - Cadastrar um candidato");
			System.out.println("3 - Inscrever um candidato em uma determinada prova");
			System.out.println("4 - Mostrar concursos em um intervalo de datas");
			System.out.println("5 - Mostrar os concursos com salarios maiores que um determinado valor");
			System.out.println("6 - Mostrar os concursos de uma determinada cidade");
			System.err.println("7 - Mostrar os concursos com um determinado numero de vagas");
			System.out.println("8 - Todas as provas no sistema");
			System.out.println("9 - Todos candidatos no sistema");
			System.out.println("10 - Sair");

			int opcaoMenu = tec.nextInt();

			if (opcaoMenu == 1) {

				int id = bancoDeDados.getProvas().size() + 1;

				System.out.println("Insira a data da prova:");
				System.out.println("Ano:");
				int ano = tec.nextInt();
				System.out.println("Mês:");
				int mes = tec.nextInt();
				System.out.println("Dia:");
				int dia = tec.nextInt();
				System.out.println("Hora:");
				int hora = tec.nextInt();
				System.out.println("Minuto:");
				int minuto = tec.nextInt();

				LocalDateTime data = LocalDateTime.of(ano, mes, dia, hora, minuto);

				System.out.println("Insira o nome do Estado:");
				String nomeEstado = tec.next();

				System.out.println("Insira a sigla do Estado:");
				String sigla = tec.next();

				Estado estado = new Estado(nomeEstado, sigla);

				System.out.println("Insira o nome da cidade:");
				String nomeCidade = tec.next();

				Cidade cidade = new Cidade(nomeCidade, estado);

				System.out.println("Informe o endereço:");

				System.out.println("Rua:");
				String rua = tec.next();

				System.out.println("Número:");
				int numero = tec.nextInt();

				System.out.println("Bairro:");
				String bairro = tec.next();

				System.out.println("Complemento:");
				String complemento = tec.next();

				System.out.println("Insira o CEP:");
				String cep = tec.next();

				Endereco endereco = new Endereco(rua, numero, bairro, complemento, cep, cidade);

				System.out.println("Informe o número de vagas:");
				int numeroVagas = tec.nextInt();

				System.out.println("Insira a descrição:");
				String descricao = tec.next();

				System.out.println("Insira a empresa:");
				String empresa = tec.next();

				System.out.println("Insira o salário base:");
				double salarioBase = tec.nextDouble();

				Prova prova = new Prova(id, data, endereco, numeroVagas, descricao, empresa, salarioBase);
				bancoDeDados.adicionarProva(prova);

			}

			else if (opcaoMenu == 2) {
				System.out.println("Informe o nome:");
				String nome = tec.next();
				System.out.println("Informe o CPF:");
				String cpf = tec.next();

				Candidato candidato = new Candidato(nome, cpf);
				bancoDeDados.adicionarCandidato(candidato);

			}
			// 3 - Inscrever um candidato para uma determinada prova
			else if (opcaoMenu == 3) {
				System.out.println("Informe o identificador do aluno (CPF): ");
				String cpf = tec.next();

				System.out.println("Informe o ID da prova:");
				int idProva = tec.nextInt();

				// filtrar a lista de candidato e obter o candidato
				Candidato candidatoEncontrado = bancoDeDados.filtrarCandidato(cpf);

				if (candidatoEncontrado == null) {
					System.out.println("Candidato não encontrado!");
				}

				// filtrar a lista de provas e obter a prova
				Prova provaEncontrada = bancoDeDados.filtrarProva(idProva);

				if (provaEncontrada == null) {
					System.out.println("Prova não encontrada!");
				}

				if (candidatoEncontrado != null && provaEncontrada != null) {
					provaEncontrada.inscreverCandidato(candidatoEncontrado);
					System.out.println("Candidato " + candidatoEncontrado.getNome() + " inscrito na prova de ID "
							+ provaEncontrada.getId());
				}

				// 4 - Mostrar concursos com intervalos entre datas
				// Ex.: Os concursos entre 20/01/2020 - 28/01/2020
			} else if (opcaoMenu == 4) {
				System.out.println("Insira a primeira data:");
				System.out.println("Ano:");
				int anoInicio = tec.nextInt();
				System.out.println("Mês:");
				int mesInicio = tec.nextInt();
				System.out.println("Dia:");
				int diaInicio = tec.nextInt();

				System.out.println("Insira a segunda data:");
				System.out.println("Ano:");
				int anoFim = tec.nextInt();
				System.out.println("Mês:");
				int mesFim = tec.nextInt();
				System.out.println("Dia:");
				int diaFim = tec.nextInt();

				LocalDateTime dataInicio = LocalDateTime.of(anoInicio, mesInicio, diaInicio, 00, 00);
				LocalDateTime dataFim = LocalDateTime.of(anoFim, mesFim, diaFim, 23, 59);

				List<Prova> provasPorDataEncontradas = bancoDeDados.filtrarProvaData(dataInicio, dataFim);

				if (provasPorDataEncontradas.isEmpty()) {
					System.out.println("Não existem provas nesse intervalo de datas!");
				} else {
					System.out.println("*****Informações das provas encontradas*****");
					for (Prova provaData : provasPorDataEncontradas) {
						System.out.println("ID: " + provaData.getId() + " - Data: " + provaData.getData());
					}
				}

			}

			// 5 - Mostrar os concursos com salarios maiores que um determinado valor
			// Ex.: O usuÃ¡rio informa R$ 2000,00 e o sistema mostra todos
			else if (opcaoMenu == 5) {
				System.out.println("Informe o valor mínimo do SALÁRIO do concurso para pesquisa:");
				double salario = tec.nextDouble();

				List<Prova> provasPorSalarioEncontradas = bancoDeDados.filtrarProvaSalario(salario);

				if (provasPorSalarioEncontradas.isEmpty()) {
					System.out.println("Não existem provas com salário maior que R$" + salario);
				} else {
					System.out.println("*****ID e salários das provas encontradas*****");
					for (Prova provaSalario : provasPorSalarioEncontradas) {
						System.out.println(
								"ID: " + provaSalario.getId() + " - Salário: R$" + provaSalario.getSalarioBase());
					}

				}

			}

			// 6 - Mostrar os concursos de uma determinada cidade
			// Ex.: O usuÃ¡rio informa Porto Alegre e o sistema mostra todos
			// os consursos que sÃ£o desta cidade
			else if (opcaoMenu == 6) {
				System.out.println("Informe a CIDADE para pesquisar os respectivos concursos:");
				String cidadeFiltro = tec.next();

				List<Prova> provaEncontradaCidade = bancoDeDados.filtrarProvaCidade(cidadeFiltro);

				if (provaEncontradaCidade.isEmpty()) {
					System.out.println("Não existem provas na cidade " + cidadeFiltro);
				} else {
					System.out.println("*****ID e Cidade das provas encontradas*****");
					for (Prova provaCidade : provaEncontradaCidade) {
						System.out.println("ID: " + provaCidade.getId() + " - Cidade: "
								+ provaCidade.getEndereco().getCidade().getNome());
					}
				}

			}

			// 7 - Mostrar os concursos com um determinado numero de vagas
			else if (opcaoMenu == 7) {
				System.out.println("Informe o número de VAGAS para pesquisar os respectivos concursos:");
				int vagasFiltro = tec.nextInt();

				List<Prova> provaEncontradaVagas = bancoDeDados.filtrarProvaVagas(vagasFiltro);

				if (provaEncontradaVagas.isEmpty()) {
					System.out.println("Não existem provas com " + vagasFiltro + " vagas.");
				} else {
					System.out.println("*****ID e Vagas das provas encontradas*****");
					for (Prova provaVagas : provaEncontradaVagas) {
						System.out.println("ID: " + provaVagas.getId() + " - Vagas: " + provaVagas.getNumeroVagas());
					}
				}

			} else if (opcaoMenu == 8) {
				System.out.println("Todas as provas do sistema");
				bancoDeDados.imprimirProva(bancoDeDados);

			} else if (opcaoMenu == 9) {
				System.out.println("Todos candidatos do sistema");
				bancoDeDados.imprimirCandidato(bancoDeDados);

			} else if (opcaoMenu == 10) {
				opcao = "N";
				break;
			}

			System.out.println("Deseja continuar?");
			opcao = tec.next();
		}
	}
}
