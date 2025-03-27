package Aula44Ex2;

public class Atleta implements Corredor, Nadador {

	@Override
	public void nadar() {
		System.out.println("o atleta está nadando.");
		
	}

	@Override
	public void correr() {
		System.out.println("o atleta está correndo.");
		
	}

}
