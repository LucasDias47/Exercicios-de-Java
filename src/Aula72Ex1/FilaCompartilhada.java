package Aula72Ex1;

import java.util.LinkedList;
import java.util.Queue;


public class FilaCompartilhada {
	
	private final Queue<Integer> fila = new LinkedList<>();
	private final int capacidade =3;
	
	public  synchronized void produzir(int valor) throws InterruptedException{
		
		while (fila.size()== capacidade) {
			wait();
		}
		fila.add(valor);
		System.out.println("Produzido: " + valor);
		notifyAll();
	}
	
	public synchronized int consumir()throws InterruptedException{
		
		while (fila.isEmpty()) {
			wait();
		}
		
		int valor = fila.poll();
		System.out.println("Consumido: "+ valor);
		notifyAll();
		return valor;
	}
	
	

}
