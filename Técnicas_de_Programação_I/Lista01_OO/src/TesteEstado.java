
public class TesteEstado {

	public static void main(String[] args) {

		Estado rs = new Estado();
		rs.setNome("Rio Grande do Sul");
		rs.setSigla("RS");

		System.out.println(rs.getNome());
		System.out.println(rs.getSigla());

		Estado rj = new Estado();
		rj.setNome("Rio de Janeiro");
		rj.setSigla("RJ");

		System.out.println(rj.getNome());
		System.out.println(rj.getSigla());

		Estado sp = new Estado();
		sp.setNome("São Paulo");
		sp.setSigla("SP");

		System.out.println(sp.getNome());
		System.out.println(sp.getSigla());

	}

}
