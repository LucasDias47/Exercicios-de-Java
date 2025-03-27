package Aula72Ex1;

public class Produtor extends Thread{
	
	private final FilaCompartilhada fila;
	
	public Produtor(FilaCompartilhada fila) {
		this.fila=fila;
	}
	
	@Override
	public void run() {
		
		try {
			for (int i = 1; i <= 5;i++) {
				fila.produzir(i);
				Thread.sleep(500);
			 }
			}catch(InterruptedException e) {
					e.printStackTrace();
			
		}
		
	}

}
