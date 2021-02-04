
public class TesteCliente {

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

		Contato contato1 = new Contato();
		contato1.setEmail("ilarie123@hotmail.com");
		contato1.setTelefone("3208-8754");
		contato1.setCelular("98742-0896");
		contato1.setVoip("65363535");

		Cliente cliente1 = new Cliente();
		cliente1.setNome("Arthur");
		cliente1.setSobreNome("Capelli");
		cliente1.setNomeFantasia("Arthuru");
		cliente1.setRazaoSocial("nao sei");
		cliente1.setCpf("473290482");
		cliente1.setRg("09843902");
		cliente1.setCnpj("0327489");
		cliente1.setInscricaoEstadual("09378912");
		cliente1.setEndereco(endereco1);
		cliente1.setContato(contato1);
		
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getSobreNome());
		System.out.println(cliente1.getNomeFantasia());
		System.out.println(cliente1.getRazaoSocial());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getRg());
		System.out.println(cliente1.getCnpj());
		System.out.println(cliente1.getInscricaoEstadual());
		System.out.println(cliente1.getEndereco().getRua());
		System.out.println(cliente1.getEndereco().getNumero());
		System.out.println(cliente1.getEndereco().getBairro());
		System.out.println(cliente1.getEndereco().getComplemento());
		System.out.println(cliente1.getEndereco().getCep());
		System.out.println(cliente1.getEndereco().getCidade().getNome());
		System.out.println(cliente1.getEndereco().getCidade().getEstado().getNome());
		System.out.println(cliente1.getEndereco().getCidade().getEstado().getSigla());
	}

}
