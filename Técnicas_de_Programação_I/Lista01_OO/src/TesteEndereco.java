
public class TesteEndereco {

	public static void main(String[] args) {
		Estado rs = new Estado();
		rs.setNome("Rio Grande do Sul");
		rs.setSigla("RS");

		Cidade PortoAlegre = new Cidade();
		PortoAlegre.setNome("Porto Alegre");
		PortoAlegre.setEstado(rs);

		Endereco endereco1 = new Endereco();
		endereco1.setRua("Rua das Flores");
		endereco1.setNumero(10);
		endereco1.setBairro("São Miguel");
		endereco1.setComplemento("Casa");
		endereco1.setCep("91080-050");
		endereco1.setCidade(PortoAlegre);

		System.out.println(endereco1.getRua());
		System.out.println(endereco1.getNumero());
		System.out.println(endereco1.getBairro());
		System.out.println(endereco1.getComplemento());
		System.out.println(endereco1.getCep());
		System.out.println(endereco1.getCidade().getNome());
		System.out.println(endereco1.getCidade().getEstado().getNome());
		System.out.println(endereco1.getCidade().getEstado().getSigla());

		System.out.println("----------------------------------------");

		Estado rj = new Estado();
		rj.setNome("Rio de Janeiro");
		rj.setSigla("RJ");

		Cidade RioDeJaneiro = new Cidade();
		RioDeJaneiro.setNome("Rio de Janeiro");
		RioDeJaneiro.setEstado(rj);

		Endereco endereco2 = new Endereco();
		endereco2.setRua("Rua Shalala");
		endereco2.setNumero(564);
		endereco2.setBairro("Auxiliadora");
		endereco2.setComplemento("Apartamento");
		endereco2.setCep("95246-070");
		endereco2.setCidade(PortoAlegre);

		System.out.println(endereco2.getRua());
		System.out.println(endereco2.getNumero());
		System.out.println(endereco2.getBairro());
		System.out.println(endereco2.getComplemento());
		System.out.println(endereco2.getCep());
		System.out.println(endereco2.getCidade().getNome());
		System.out.println(endereco2.getCidade().getEstado().getNome());
		System.out.println(endereco2.getCidade().getEstado().getSigla());

	}

}
