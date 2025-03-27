package Aula72Ex2R;

public class Garcom {
	
	private int[] pratos = new int[1];
	private boolean pratoDisponivel = false;
	
	public synchronized void servirPrato(int prato) throws InterruptedException{
		while (pratoDisponivel) {
			wait();
		}
	pratos[0]=prato;
	pratoDisponivel = true;
	System.out.println("Garçom: Prato "+ prato + " está pronto!");
	notifyAll();
		
	}
	
	public synchronized void receberPrato(int clienteNum) throws InterruptedException{
		while (!pratoDisponivel) {
			wait();
		}
		System.out.println("Cliente " + clienteNum + " pegou o Prato "+ pratos[0]);
		pratoDisponivel = false;
		notifyAll();
	}
	
	

}
