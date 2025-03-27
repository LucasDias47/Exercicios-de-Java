package Aula71Ex1;

public class Contador {
	
	private int valor;
	
	public synchronized int Incrementar(int[]array) {
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//valor = 0;
		
		for(int i = 0; i<array.length; i++) {
			valor++;
			//valor = i+1;
		}
		
		return valor;
		
		
	}
	
	public synchronized int mostrarValor() {
		
		System.out.println("Thread-"+Thread.currentThread().getName() +" incrementou: "+valor);
		return 0;
	}

}
