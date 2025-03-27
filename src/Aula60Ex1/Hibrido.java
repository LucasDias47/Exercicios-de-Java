package Aula60Ex1;

public class Hibrido extends Veiculo implements Motorizado,Eletrico{

	public Hibrido(String marca, String modelo, int ano, Categoria categoria) {
		super(modelo, modelo, ano, categoria);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void abastecer() {
		 System.out.println("Abastecendo carro com combustivel...");
		 System.out.println();
	}
	
	 public void abastecerEletrico() {
	        System.out.println("Abastecendo carro híbrido com eletricidade...");
	    }

}
