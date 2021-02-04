
public class Main {

	public static void main(String[] args) {

		Marca volkswagen = new Marca();
		volkswagen.setNome("Volkswagen");
		volkswagen.setDescricao("A VW foi criada na alemanha para produzir carros populares!");

		Carro fusca = new Carro();
		fusca.setCor("Azul");
		fusca.setCapacidadeCombustivel(30);
		fusca.setNumeroPortas(2);
		fusca.setPotenciaMotor(1.3);
		fusca.setVolumePortaMalas(40);
		fusca.setMarca(volkswagen);

		System.out.println(fusca.getCor());
		System.out.println(fusca.getCapacidadeCombustivel());
		System.out.println(fusca.getNumeroPortas());
		System.out.println(fusca.getVolumePortaMalas());
		System.out.println(fusca.getPotenciaMotor());
		System.out.println(fusca.getMarca().getNome());
		System.out.println(fusca.getMarca().getDescricao());

		Carro bmw = new Carro();
		bmw.setCapacidadeCombustivel(60);
		bmw.setCor("Preta");
		bmw.setNumeroPortas(4);
		bmw.setVolumePortaMalas(400);
		bmw.setPotenciaMotor(4.6);

		System.out.println(bmw.getCapacidadeCombustivel());
		System.out.println(bmw.getCor());
		System.out.println(bmw.getNumeroPortas());
		System.out.println(bmw.getPotenciaMotor());
		System.out.println(bmw.getVolumePortaMalas());

	}

}
