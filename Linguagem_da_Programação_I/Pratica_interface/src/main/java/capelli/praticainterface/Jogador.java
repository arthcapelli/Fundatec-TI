package capelli.praticainterface;

import java.util.List;

public class Jogador extends Atleta implements Funcionario {
    private String nome;
    private String posicao;
    private int idade;
    private int golsMarcados;

    public String getNome() {
        return nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public int getIdade() {
        return idade;
    }

    public int getGolsMarcados() {
        return golsMarcados;
    }

    public Jogador(List<String> fraquezas, List<String> forcas, List<String> lesoes, String nome, String posicao,
                   int idade, int golsMarcados) {
        super(fraquezas, forcas, lesoes);
        this.nome = nome;
        this.posicao = posicao;
        this.idade = idade;
        this.golsMarcados = golsMarcados;
    }

    @Override
    public double calculaSalario() {
        String posicaoAtleta = this.posicao.toLowerCase();
        int gols = this.golsMarcados;
        int bonusPorGol = 1000 * gols;
        double salario = 0;

        if (posicaoAtleta.equals("defesa")) {
            salario = 10000.00;
        } else if (posicaoAtleta.equals("meio-campo")) {
            salario = 15000.00;
        } else if (posicaoAtleta.equals("atacante")) {
            salario = 20000.00;
        }

        return salario + bonusPorGol;
    }

    @Override
    public Treinamento especificarTreinamento(String nome, int duracao) {
        return new Treinamento(nome, duracao);
    }
}
