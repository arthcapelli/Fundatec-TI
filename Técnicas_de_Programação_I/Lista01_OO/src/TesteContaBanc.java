
public class TesteContaBanc {

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

		ContaBancaria conta1 = new ContaBancaria();
		conta1.setNumero("653243");
		conta1.setAgencia("098");
		conta1.setCliente(cliente1);

		System.out.println(conta1.getNumero());
		System.out.println(conta1.getAgencia());
		System.out.println(conta1.getCliente().getNome());
		System.out.println(conta1.getCliente().getSobreNome());
		System.out.println(conta1.getCliente().getNomeFantasia());
		System.out.println(conta1.getCliente().getRazaoSocial());
		System.out.println(conta1.getCliente().getCpf());
		System.out.println(conta1.getCliente().getRg());
		System.out.println(conta1.getCliente().getCnpj());
		System.out.println(conta1.getCliente().getInscricaoEstadual());
		System.out.println(conta1.getCliente().getEndereco().getRua());
		System.out.println(conta1.getCliente().getEndereco().getNumero());
		System.out.println(conta1.getCliente().getEndereco().getBairro());
		System.out.println(conta1.getCliente().getEndereco().getComplemento());
		System.out.println(conta1.getCliente().getEndereco().getCep());
		System.out.println(conta1.getCliente().getEndereco().getCidade().getNome());
		System.out.println(conta1.getCliente().getEndereco().getCidade().getEstado().getNome());
		System.out.println(conta1.getCliente().getEndereco().getCidade().getEstado().getSigla());

	}

}
