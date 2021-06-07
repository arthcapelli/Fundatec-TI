package capelli.praticainterface;

import java.util.List;

public abstract class Atleta {
    private List<String> fraquezas;
    private List<String> forcas;
    private List<String> lesoes;

    protected Atleta(List<String> fraquezas, List<String> forcas, List<String> lesoes) {
        this.fraquezas = fraquezas;
        this.forcas = forcas;
        this.lesoes = lesoes;
    }

    public List<String> getFraquezas() {
        return fraquezas;
    }

    public List<String> getForcas() {
        return forcas;
    }

    public List<String> getLesoes() {
        return lesoes;
    }

    protected abstract Treinamento especificarTreinamento(String nome, int duracao);

}
