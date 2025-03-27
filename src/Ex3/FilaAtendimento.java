package Ex3;

import java.util.LinkedList;

public class FilaAtendimento {

	private final LinkedList<String> fila = new LinkedList<>();
	
	public synchronized void adicionarPedido(String pedido) {
		
		fila.add(pedido);
		System.out.println("Novo pedido adicionado: "+ pedido);
		notify();
	}
	
	public synchronized void processarPedido() {
		
		while(fila.isEmpty()) {
			
			try {
			System.out.println("Aguardando pedidos...");
			
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			
			
			
			
		}
		String pedido = fila.poll();
		System.out.println("Processando: " + pedido);
	}
	
	
}
