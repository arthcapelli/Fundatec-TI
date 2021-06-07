package capelli.praticainterface;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class JogadorTest {
    @Test
    void deveCalcularSalarioDefesaSemGol() {
        List<String> fraquezas = new ArrayList<>();
        fraquezas.add("lento");
        fraquezas.add("pesado");
        List<String> forcas = new ArrayList<>();
        forcas.add("forte");
        forcas.add("cabeceador");
        List<String> possiveisLesoes = new ArrayList<>();
        possiveisLesoes.add("ruptura ligamento");

        Jogador jogador = new Jogador(fraquezas, forcas, possiveisLesoes, "Arthur", "defesa", 20, 0);

        double salarioCalculado = jogador.calculaSalario();
        double salarioEsperado = 10000.00;

        Assertions.assertEquals(salarioEsperado, salarioCalculado);
    }

    @Test
    void deveCalcularSalarioDefesaComGol() {
        List<String> fraquezas = new ArrayList<>();
        fraquezas.add("lento");
        fraquezas.add("pesado");
        List<String> forcas = new ArrayList<>();
        forcas.add("forte");
        forcas.add("cabeceador");
        List<String> possiveisLesoes = new ArrayList<>();
        possiveisLesoes.add("ruptura ligamento");

        Jogador jogador = new Jogador(fraquezas, forcas, possiveisLesoes, "Arthur", "defesa", 20, 1);

        double salarioCalculado = jogador.calculaSalario();
        double salarioEsperado = 11000.00;

        Assertions.assertEquals(salarioEsperado, salarioCalculado);
    }

    @Test
    void deveCalcularSalarioMeioCampoSemGol() {
        List<String> fraquezas = new ArrayList<>();
        fraquezas.add("lento");
        fraquezas.add("pesado");
        List<String> forcas = new ArrayList<>();
        forcas.add("forte");
        forcas.add("cabeceador");
        List<String> possiveisLesoes = new ArrayList<>();
        possiveisLesoes.add("ruptura ligamento");

        Jogador jogador = new Jogador(fraquezas, forcas, possiveisLesoes, "Arthur", "meio-campo", 20, 0);

        double salarioCalculado = jogador.calculaSalario();
        double salarioEsperado = 15000.00;

        Assertions.assertEquals(salarioEsperado, salarioCalculado);
    }

    @Test
    void deveCalcularSalarioMeioCampoComGol() {
        List<String> fraquezas = new ArrayList<>();
        fraquezas.add("lento");
        fraquezas.add("pesado");
        List<String> forcas = new ArrayList<>();
        forcas.add("forte");
        forcas.add("cabeceador");
        List<String> possiveisLesoes = new ArrayList<>();
        possiveisLesoes.add("ruptura ligamento");

        Jogador jogador = new Jogador(fraquezas, forcas, possiveisLesoes, "Arthur", "meio-campo", 20, 1);

        double salarioCalculado = jogador.calculaSalario();
        double salarioEsperado = 16000.00;

        Assertions.assertEquals(salarioEsperado, salarioCalculado);
    }

    @Test
    void deveCalcularSalarioAtacanteSemGol() {
        List<String> fraquezas = new ArrayList<>();
        fraquezas.add("lento");
        fraquezas.add("pesado");
        List<String> forcas = new ArrayList<>();
        forcas.add("forte");
        forcas.add("cabeceador");
        List<String> possiveisLesoes = new ArrayList<>();
        possiveisLesoes.add("ruptura ligamento");

        Jogador jogador = new Jogador(fraquezas, forcas, possiveisLesoes, "Arthur", "atacante", 20, 0);

        double salarioCalculado = jogador.calculaSalario();
        double salarioEsperado = 20000.00;

        Assertions.assertEquals(salarioEsperado, salarioCalculado);
    }

    @Test
    void deveCalcularSalarioAtacanteComGol() {
        List<String> fraquezas = new ArrayList<>();
        fraquezas.add("lento");
        fraquezas.add("pesado");
        List<String> forcas = new ArrayList<>();
        forcas.add("forte");
        forcas.add("cabeceador");
        List<String> possiveisLesoes = new ArrayList<>();
        possiveisLesoes.add("ruptura ligamento");

        Jogador jogador = new Jogador(fraquezas, forcas, possiveisLesoes, "Arthur", "atacante", 20, 1);

        double salarioCalculado = jogador.calculaSalario();
        double salarioEsperado = 21000.00;

        Assertions.assertEquals(salarioEsperado, salarioCalculado);
    }

    @Test
    void deveEspecificarNomeTreinamento() {
        List<String> fraquezas = new ArrayList<>();
        fraquezas.add("lento");
        fraquezas.add("pesado");
        List<String> forcas = new ArrayList<>();
        forcas.add("forte");
        forcas.add("cabeceador");
        List<String> possiveisLesoes = new ArrayList<>();
        possiveisLesoes.add("ruptura ligamento");

        Jogador jogador = new Jogador(fraquezas, forcas, possiveisLesoes, "Arthur", "atacante", 20, 0);

        Treinamento treinamento = jogador.especificarTreinamento("Corrida", 5);
        String nomeTreinamento = treinamento.getNome();
        String nomeEsperado = "Corrida";

        Assertions.assertEquals(nomeEsperado, nomeTreinamento);
    }

    @Test
    void deveEspecificarHorasTreinamento() {
        List<String> fraquezas = new ArrayList<>();
        fraquezas.add("lento");
        fraquezas.add("pesado");
        List<String> forcas = new ArrayList<>();
        forcas.add("forte");
        forcas.add("cabeceador");
        List<String> possiveisLesoes = new ArrayList<>();
        possiveisLesoes.add("ruptura ligamento");

        Jogador jogador = new Jogador(fraquezas, forcas, possiveisLesoes, "Arthur", "atacante", 20, 0);

        Treinamento treinamento = jogador.especificarTreinamento("Corrida", 5);
        int duracaoTreinamento = treinamento.getDuracao();
        int duracaoEsperado = 5;

        Assertions.assertEquals(duracaoEsperado, duracaoTreinamento);
    }

    @Test
    void deveCriarListaDeFraquezasCorretamente() {
        List<String> fraquezas = new ArrayList<>();
        fraquezas.add("lento");
        fraquezas.add("pesado");
        List<String> forcas = new ArrayList<>();
        forcas.add("forte");
        forcas.add("cabeceador");
        List<String> possiveisLesoes = new ArrayList<>();
        possiveisLesoes.add("ruptura ligamento");

        Jogador jogador = new Jogador(fraquezas, forcas, possiveisLesoes, "Arthur", "atacante", 20, 0);

        List<String> fraquezasCriadas = jogador.getFraquezas();
        List<String> fraquezasEsperadas = new ArrayList<>();
        fraquezasEsperadas.add("lento");
        fraquezasEsperadas.add("pesado");

        Assertions.assertEquals(fraquezasEsperadas, fraquezasCriadas);
    }

    @Test
    void deveCriarListaDeForcasCorretamente() {
        List<String> fraquezas = new ArrayList<>();
        fraquezas.add("lento");
        fraquezas.add("pesado");
        List<String> forcas = new ArrayList<>();
        forcas.add("forte");
        forcas.add("cabeceador");
        List<String> possiveisLesoes = new ArrayList<>();
        possiveisLesoes.add("ruptura ligamento");

        Jogador jogador = new Jogador(fraquezas, forcas, possiveisLesoes, "Arthur", "atacante", 20, 0);

        List<String> forcasCriadas = jogador.getForcas();
        List<String> forcasEsperadas = new ArrayList<>();
        forcasEsperadas.add("forte");
        forcasEsperadas.add("cabeceador");

        Assertions.assertEquals(forcasEsperadas, forcasCriadas);
    }

    @Test
    void deveCriarListaDeLesoesCorretamente() {
        List<String> fraquezas = new ArrayList<>();
        fraquezas.add("lento");
        fraquezas.add("pesado");
        List<String> forcas = new ArrayList<>();
        forcas.add("forte");
        forcas.add("cabeceador");
        List<String> possiveisLesoes = new ArrayList<>();
        possiveisLesoes.add("ruptura ligamento");

        Jogador jogador = new Jogador(fraquezas, forcas, possiveisLesoes, "Arthur", "atacante", 20, 0);

        List<String> lesoesCriadas = jogador.getLesoes();
        List<String> lesoesEsperadas = new ArrayList<>();
        lesoesEsperadas.add("ruptura ligamento");

        Assertions.assertEquals(lesoesEsperadas, lesoesCriadas);
    }

}
