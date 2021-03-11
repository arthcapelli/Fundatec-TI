
public class Livro {
	private String nome;
	private String autor;
	private String isbn;

	public String getNome() {
		return nome;
	}

	public String getAutor() {
		return autor;
	}

	public String getISBN() {
		return isbn;
	}

	public Livro(String nome, String autor, String isbn) {
		this.nome = nome;
		this.autor = autor;
		this.isbn = isbn;
	}

}
