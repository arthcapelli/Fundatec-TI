
public class MainTime {
	public static void main(String[] args) {

		// vitorias;
		// derrotas;
		// empates;
		// golsPro;
		// golsContra;
		// titulos;
		// posicaoTabela;
		// torcedores;

		TimesFutebol gremio = new TimesFutebol();
		gremio.setVitorias(10);
		gremio.setDerrotas(2);
		gremio.setEmpates(20);
		gremio.setGolsPro(30);
		gremio.setGolsContra(12);
		gremio.setTitulos(24);
		gremio.setPosicaoTabela(7);
		gremio.setTorcedores(52000000);

		System.out.println("****** Grêmio ******");
		System.out.println("Vitórias G: " + gremio.getVitorias());
		System.out.println("Derrotas G: " + gremio.getDerrotas());
		System.out.println("Empates G: " + gremio.getEmpates());
		System.out.println("Gols Pró G: " + gremio.getGolsPro());
		System.out.println("Gols Contra G: " + gremio.getGolsContra());
		System.out.println("Títulos G: " + gremio.getTitulos());
		System.out.println("Posição na tabela G: " + gremio.getPosicaoTabela());
		System.out.println("Torcedores G: " + gremio.getTorcedores());

		System.out.println("");
		System.out.println("------------------------------");
		System.out.println("");

		TimesFutebol inter = new TimesFutebol();
		inter.setVitorias(12);
		inter.setDerrotas(5);
		inter.setEmpates(13);
		inter.setGolsPro(35);
		inter.setGolsContra(15);
		inter.setTitulos(10);
		inter.setPosicaoTabela(2);
		inter.setTorcedores(2);

		System.out.println("****** Internacional ******");
		System.out.println("Vitórias I: " + inter.getVitorias());
		System.out.println("Derrotas I: " + inter.getDerrotas());
		System.out.println("Empates I: " + inter.getEmpates());
		System.out.println("Gols Pró I: " + inter.getGolsPro());
		System.out.println("Gols COntra I: " + inter.getGolsContra());
		System.out.println("Títulos I: " + inter.getTitulos());
		System.out.println("Posição na tabela I: " + inter.getPosicaoTabela());
		System.out.println("Torcedores I: " + inter.getTorcedores());

	}

}