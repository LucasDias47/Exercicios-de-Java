package Aula46Ex3;

public class Carro extends Veiculo implements Automovel{

	public Carro(int velocidade) {
		super(velocidade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acelerar() {
		setVelocidade(10);
		
	}
	
	void exibir() {
		System.out.println("Carro a " + getVelocidade() + " km/h");
	}

	
}
