package Ex6;

import java.util.ArrayList;
import java.util.TreeSet;

public class Loja {
	
	private int pedido;
	private String cliente;
	private boolean disponivel = false;
	
	private ArrayList<Integer> pedidos = new ArrayList<>();
	private TreeSet<String> clientes = new TreeSet<>();
	
	public TreeSet<String> getClientes() {
		return clientes;
	}

	public void setClientes(TreeSet<String> clientes) {
		this.clientes = clientes;
	}

	public synchronized void adicionarPedidos(int pedido, String cliente) {
		
		while(disponivel) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		pedidos.add(pedido);
		System.out.println("Pedido adicionado: Pedido " + pedido + " de "+ cliente);
		disponivel=true;
		
		notify();
	}
	
	public synchronized void processarPedidos(int pedido, String cliente) {
		
		while(!disponivel) {
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Pedido processado: Pedido " + pedido + " de "+ cliente);
		clientes.add(cliente);
		disponivel = false;
		
		notify();
	}
	
	public void imprimirNomes() {
		System.out.println("Lista de clientes ordenados: ");
		for (String i : clientes) {
			System.out.println(i);
		}
	}
	
	
	
	
	

}
