package Aula70Ex1;

public class Prioridade implements Runnable{

	private String nome;
	//private int tempo;
	
	
	
	public Prioridade(String nome) {
		this.nome = nome;
		//this.tempo = tempo;
		
		//Thread t = new Thread(this);
		//t.start();
	}



	@Override
	public void run() {
	
		for (int i =0 ;i<6;i++) {
			System.out.println("Thread "+ nome + " - "+i);
		}
		
	}

}
