import java.util.ArrayList;
import java.util.List;

public class Produtos {
	private List<Produto> produtos = new ArrayList<Produto>();

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}

	public int filtrarProdutoNomeCont(String nomeFiltro) {
		int cont = 0;
		for (Produto produtoLoop : produtos) {
			if (produtoLoop.getNome().contains(nomeFiltro)) {
				cont++;
			}
		}
		return cont;
	}

	public List<Produto> filtrarProdutoNome(String nomeFiltro) {
		List<Produto> produtosPorNome = new ArrayList<Produto>();
		for (Produto produtoLoop : produtos) {
			if (produtoLoop.getNome().contains(nomeFiltro)) {
				produtosPorNome.add(produtoLoop);
			}
		}
		return produtosPorNome;
	}

}
