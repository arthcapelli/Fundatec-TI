package capelli.praticainterface;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class TimeTest {
    @Test
    void deveRetornarListasDeJogadoresTime() {
        Jogador jogador = new Jogador(null, null, null, "Arthur", "atacante", 20, 0);
        Jogador jogador2 = new Jogador(null, null, null, "Arthur", "atacante", 20, 0);
        Jogador jogador3 = new Jogador(null, null, null, "Arthur", "atacante", 20, 0);
        List<Jogador> jogadoresDoTime = new ArrayList<>();
        jogadoresDoTime.add(jogador);
        jogadoresDoTime.add(jogador2);
        jogadoresDoTime.add(jogador3);

        Time time = new Time(jogadoresDoTime);

        List<Jogador> timeEsperado = new ArrayList<>();
        timeEsperado.add(jogador);
        timeEsperado.add(jogador2);
        timeEsperado.add(jogador3);

        List<Jogador> timeCriado = time.getJogadoresDoTime();

        Assertions.assertEquals(timeEsperado, timeCriado);
    }
}
