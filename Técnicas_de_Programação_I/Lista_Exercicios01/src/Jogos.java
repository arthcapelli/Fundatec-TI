import java.util.ArrayList;
import java.util.List;

public class Jogos {
	private List<Jogo> jogos = new ArrayList<Jogo>();

	public List<Jogo> getJogos() {
		return jogos;
	}

	public void adicionarJogo(Jogo jogo) {
		jogos.add(jogo);
	}

	public int contEmpate() {
		int cont = 0;
		for (Jogo jogoLoop : jogos) {
			if (jogoLoop.getTime1().getGols() == jogoLoop.getTime2().getGols()) {
				cont++;
			}
		}
		return cont;
	}

	public int contVitoria1() {
		int cont = 0;
		for (Jogo jogoLoop : jogos) {
			if (jogoLoop.getTime1().getGols() > jogoLoop.getTime2().getGols()) {
				cont++;
			}
		}
		return cont;
	}

	public int contVitoria2() {
		int cont = 0;
		for (Jogo jogoLoop : jogos) {
			if (jogoLoop.getTime1().getGols() < jogoLoop.getTime2().getGols()) {
				cont++;
			}
		}
		return cont;
	}

}
