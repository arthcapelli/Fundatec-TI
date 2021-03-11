import java.util.List;
import java.util.Scanner;

public class MainProdutos {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String opcao = "S";

		Produtos produtos = new Produtos();

		while (opcao.equals("S")) {

			System.out.println("---Escolha uma opção:---");
			System.out.println("A - Adicionar produtos");
			System.out.println("B - Filtrar produtos pelo nome e retornar a quantidade na lista");
			System.out.println("C - Filtrar produtos pelo nome e retornar uma lista com eles");
			System.out.println("D - Sair");
			String opcaoMenu = tec.next();

			if (opcaoMenu.equals("A")) {
				System.out.println("Insira o nome do produto:");
				String nomeProduto = tec.next();

				System.out.println("Insira a descrição do produto:");
				String descricaoProduto = tec.next();

				System.out.println("Insira o valor do produto:");
				double valorProduto = tec.nextDouble();

				Produto produto = new Produto(nomeProduto, descricaoProduto, valorProduto);
				produtos.adicionarProduto(produto);

			}

			else if (opcaoMenu.equals("B")) {
				System.out.println("Insira o nome do produto para filtrar:");
				String nomeFiltro = tec.next();
				int cont = produtos.filtrarProdutoNomeCont(nomeFiltro);

				System.out.println("Existe(m) " + cont + " produto(s) com o nome: " + nomeFiltro);
			}

			else if (opcaoMenu.equals("C")) {
				System.out.println("Informe o PRODUTO para pesquisar:");
				String nomeFiltro = tec.next();

				List<Produto> produtoEncontrado = produtos.filtrarProdutoNome(nomeFiltro);

				if (produtoEncontrado.isEmpty()) {
					System.out.println("Não existem produtos com nome: " + nomeFiltro);
				} else {
					System.out.println("***Informação dos produtos encontrados:***");
					for (Produto produtoFiltro : produtoEncontrado) {
						System.out.println("Nome: " + produtoFiltro.getNome() + " - Descrição: "
								+ produtoFiltro.getDescricao() + " - Valor: R$" + produtoFiltro.getValor());
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
