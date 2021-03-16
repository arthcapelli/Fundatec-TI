import java.util.Scanner;

public class MainJogos {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String opcao = "S";

		Jogos jogos = new Jogos();

		while (opcao.equals("S")) {

			System.out.println("---Escolha uma opção:---");
			System.out.println("A - Adicionar jogos");
			System.out.println("B - Quantidade de jogos empatados");
			System.out.println("C - Quantidade de jogos que o TIME1 venceu");
			System.out.println("D - Quantidade de jogos que o TIME2 venceu");
			System.out.println("E - Sair");
			String opcaoMenu = tec.next();

			if (opcaoMenu.equals("A")) {
				System.out.println("Nome do time 1:");
				String nomeTime1 = tec.next();

				System.out.println("Gols do time 1:");
				int gols1 = tec.nextInt();

				Time time1 = new Time(nomeTime1, gols1);

				System.out.println("Nome do time 2:");
				String nomeTime2 = tec.next();

				System.out.println("Gols do time 2:");
				int gols2 = tec.nextInt();

				Time time2 = new Time(nomeTime2, gols2);

				Jogo jogo = new Jogo(time1, time2);
				jogos.adicionarJogo(jogo);

			}

			else if (opcaoMenu.equals("B")) {
				int contEmpate = jogos.contEmpate();

				System.out.println("Jogo empatados: " + contEmpate);
			}

			else if (opcaoMenu.equals("C")) {
				int vitoriaTime1 = jogos.contVitoria1();

				System.out.println("Jogos que o TIME 1 venceu: " + vitoriaTime1);
			}

			else if (opcaoMenu.equals("D")) {
				int vitoriaTime2 = jogos.contVitoria2();

				System.out.println("Jogos que o TIME 2 venceu: " + vitoriaTime2);
			}

			else if (opcaoMenu.equals("E")) {
				opcao = "N";
				break;
			}

			System.out.println("Deseja continuar?");
			opcao = tec.next();

		}

	}
}