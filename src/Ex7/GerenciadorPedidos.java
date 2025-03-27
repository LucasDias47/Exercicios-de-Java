package Ex7;

import java.util.ArrayList;

public class GerenciadorPedidos {
	
	
	private int pedido;
	private String cliente;
	private boolean disponivel = false;
	private int max = 0;
	private boolean finalizado = false;
	
	
	private ArrayList<Integer> pedidos = new ArrayList<>();
	
	public synchronized void adicionarPedido(int pedido, String cliente) {
		
		while(disponivel && max ==2) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		pedidos.add(pedido);
		System.out.println("Novo pedido adicionado: Pedido #"+ pedido + " - Cliente: " +cliente);
		max+=1;
		disponivel = true;
		
		notify();
		
	}
	
	public synchronized void processarPedido(int pedido, String cliente) {
		
		while(!disponivel && max <2) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Cozinha está processando o pedido; Pedido #"+pedido + " - Cliente: " +cliente);
		System.out.println("Pedido #" +pedido +" finalizado e pronto para entrega.");
		System.out.println("Entregando pedido #" + pedido+ " - Cliente: "+cliente );
		
		finalizado = true;
		notify();
		
		
		
	}
	
	public synchronized void entregarPedido(int pedido, String cliente) {
		
		while(!finalizado) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Entregando pedido #" + pedido+ " - Cliente: "+cliente );
		
	}
}
