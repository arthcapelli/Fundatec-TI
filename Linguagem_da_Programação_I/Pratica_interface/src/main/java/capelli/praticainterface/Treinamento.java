package capelli.praticainterface;

public class Treinamento {
    private String nome;
    private int duracao;

    public Treinamento(String nome, int duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracao() {
        return duracao;
    }
}
