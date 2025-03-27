package Aula67Ex1;

public class Semaforo extends Thread{

	private String cor;
	private int tempo;
	
	public Semaforo(String cor, int tempo) {
		this.cor = cor;
		this.tempo = tempo;
		start();
	}
	
	public void run() {
		
		try {
			
			for(int i = 0 ; i<4; i++) {
				
				System.out.println(cor);
				
				System.out.println("(" +tempo + " segundos depois...)" );
				
				Thread.sleep(tempo);
			}
			
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
