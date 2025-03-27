package Aula46Ex3;

public class CarroAnfibio extends Carro implements Aquatico {

	public CarroAnfibio(int velocidade) {
		super(velocidade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void flutuar() {
		System.out.println("O carro anfíbio está na água");
		
	}

}
