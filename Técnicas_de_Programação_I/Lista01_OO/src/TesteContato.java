
public class TesteContato {

	public static void main(String[] args) {
		Contato contato1 = new Contato();
		contato1.setEmail("ilarie123@hotmail.com");
		contato1.setTelefone("3208-8754");
		contato1.setCelular("98742-0896");
		contato1.setVoip("65363535");

		System.out.println(contato1.getEmail());
		System.out.println(contato1.getTelefone());
		System.out.println(contato1.getCelular());
		System.out.println(contato1.getVoip());
		
		Contato contato2 = new Contato();
		contato2.setEmail("gremio123@hotmail.com");
		contato2.setTelefone("3773-6587");
		contato2.setCelular("94657-3125");
		contato2.setVoip("876754658");

		System.out.println(contato2.getEmail());
		System.out.println(contato2.getTelefone());
		System.out.println(contato2.getCelular());
		System.out.println(contato2.getVoip());

	}

}
