package Aula70Ex2;

public class Prioridade implements Runnable{

	private String nome;
	
	

	public Prioridade(String nome) {
		this.nome = nome;
	}



	@Override
	public void run() {
		
		for(int i = 1; i<4; i++) {
			System.out.println("Thread "+ nome + " - "+ i);
		}
		
	}

}
