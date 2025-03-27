package Aula46Ex3;

public class Barco extends Veiculo implements Aquatico{

	public Barco(int velocidade) {
		super(velocidade);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public void flutuar() {
		System.out.println("O barco está flutuando");
		
	}

	void exibir() {
		System.out.println("Barco a " + getVelocidade() + " km/h");
	}
}
