package Aula71Ex1R;

public class Contador {

	private int valor = 0;

	public synchronized void incrementar() {

		valor++;
		System.out.println(Thread.currentThread().getName() + " incrementou: " + valor);
	}


	public void mostrarValor() {

		synchronized(this) {
			System.out.println("Valor atual "+ valor);
		}
	}
}
	



		
