import java.util.List;
import java.util.Scanner;

public class MainLivros {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String opcao = "S";

		Livros livros = new Livros();

		while (opcao.equals("S")) {

			System.out.println("---Escolha uma opção:---");
			System.out.println("A - Adicionar livros");
			System.out.println("B - Filtrar livros pelo nome do autor e retornar a quantidade na lista");
			System.out.println("C - Filtrar livros pelo nome do autor e retornar uma lista com eles");
			System.out.println("D - Sair");
			String opcaoMenu = tec.next();

			if (opcaoMenu.equals("A")) {
				System.out.println("Insira o nome do livro:");
				String nomeLivro = tec.next();

				System.out.println("Insira o nome do autor:");
				String nomeAutor = tec.next();

				System.out.println("Insira o ISBN:");
				String isbnLivro = tec.next();

				Livro livro = new Livro(nomeLivro, nomeAutor, isbnLivro);
				livros.adicionarLivro(livro);

			}

			else if (opcaoMenu.equals("B")) {
				System.out.println("Insira o nome do autor para filtrar:");
				String nomeFiltro = tec.next();
				int cont = livros.contLivroPorAutor(nomeFiltro);

				System.out.println("Existe(m) " + cont + " livro(s) com o autor: " + nomeFiltro);
			}

			else if (opcaoMenu.equals("C")) {
				System.out.println("Informe o autor para pesquisar:");
				String nomeFiltro = tec.next();

				List<Livro> livroEncontrado = livros.filtrarLivroAutor(nomeFiltro);

				if (livroEncontrado.isEmpty()) {
					System.out.println("Não existem livros do autor: " + nomeFiltro);
				} else {
					System.out.println("***Informação dos produtos encontrados:***");
					for (Livro livroFiltro : livroEncontrado) {
						System.out.println("Nome: " + livroFiltro.getNome() + " - Autor: " + livroFiltro.getAutor()
								+ " - ISBN: " + livroFiltro.getISBN());
					}
				}

			}

			else if (opcaoMenu.equals("D")) {
				opcao = "N";
				break;
			}

			System.out.println("Deseja continuar?");
			opcao = tec.next();

		}
	}

}
