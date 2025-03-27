package Aula74EX1R;

class MinhaThread extends Thread{
	private ContadorCompartilhado contador;

	public MinhaThread(ContadorCompartilhado contador) {
		this.contador = contador;
	}
	
	public void run() {
		for(int i =0; i<1000; i++) {
			contador.incrementar();
		}
	}
}