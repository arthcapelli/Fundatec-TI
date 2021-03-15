import java.util.ArrayList;
import java.util.List;

public class Livros {
	private List<Livro> livros = new ArrayList<Livro>();

	public List<Livro> getLivros() {
		return livros;
	}

	public void adicionarLivro(Livro livro) {
		boolean livroAdicionado = validarAdicaoLivro(livro);
		if (livroAdicionado) {
			System.out.println("O livro já foi adicionado!");
			return;
		}

		this.livros.add(livro);
	}

	private boolean validarAdicaoLivro(Livro livroParaAdicao) {
		for (Livro livroAdicionado : livros) {
			if (livroAdicionado.getISBN().equals(livroParaAdicao.getISBN())) {
				return true;
			}
		}
		return false;
	}

	public int contLivroPorAutor(String autorFiltro) {
		int cont = 0;
		for (Livro livroLoop : livros) {
			if (livroLoop.getAutor().equals(autorFiltro)) {
				cont++;
			}
		}
		return cont;
	}

	public List<Livro> filtrarLivroAutor(String autorFiltro) {
		List<Livro> livrosPorAutor = new ArrayList<Livro>();
		for (Livro livroLoop : livros) {
			if (livroLoop.getAutor().equals(autorFiltro)) {
				livrosPorAutor.add(livroLoop);
			}
		}
		return livrosPorAutor;
	}

}
