package capelli.praticainterface;

import java.util.List;

public class Time {
    private List<Jogador> jogadoresDoTime;

    public Time(List<Jogador> jogadoresDoTime) {
        this.jogadoresDoTime = jogadoresDoTime;
    }

    public List<Jogador> getJogadoresDoTime() {
        return jogadoresDoTime;
    }
}
