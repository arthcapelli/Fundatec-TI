
public class TesteCidade {

	public static void main(String[] args) {
		Estado rs = new Estado();
		rs.setNome("Rio Grande do Sul");
		rs.setSigla("RS");

		Cidade PortoAlegre = new Cidade();
		PortoAlegre.setNome("Porto Alegre");
		PortoAlegre.setEstado(rs);

		System.out.println(PortoAlegre.getNome());
		System.out.println(PortoAlegre.getEstado().getNome());
		System.out.println(PortoAlegre.getEstado().getSigla());

		Estado rj = new Estado();
		rj.setNome("Rio de Janeiro");
		rj.setSigla("RJ");

		Cidade RioDeJaneiro = new Cidade();
		RioDeJaneiro.setNome("Rio de Janeiro");
		RioDeJaneiro.setEstado(rj);

		System.out.println(RioDeJaneiro.getNome());
		System.out.println(RioDeJaneiro.getEstado().getNome());
		System.out.println(RioDeJaneiro.getEstado().getSigla());

		Estado sp = new Estado();
		sp.setNome("São Paulo");
		sp.setSigla("SP");

		Cidade SaoPaulo = new Cidade();
		SaoPaulo.setNome("São Paulo");
		SaoPaulo.setEstado(sp);

		System.out.println(SaoPaulo.getNome());
		System.out.println(SaoPaulo.getEstado().getNome());
		System.out.println(SaoPaulo.getEstado().getSigla());

	}

}
