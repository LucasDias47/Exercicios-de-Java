package Aula72Ex1;

public class Consumidor extends Thread{
	
	private final FilaCompartilhada fila;
	
	public Consumidor(FilaCompartilhada fila) {
		this.fila = fila;
	}
	
	public void run() {
		
		try {
			for(int i = 1; i<=5 ; i++) {
				fila.consumir();
				Thread.sleep(800);
			}
			
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
