package Ex5;

import java.util.HashSet;

public class GerenciadorUsuarios {
	
	private HashSet<String> lista = new HashSet<>();
	private HashSet<String> removidos = new HashSet<>();
	
	public synchronized void adicionarUsuario(String nome) {
		
		while(lista.contains(nome)) {
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
			lista.add(nome);
			if(removidos.contains(nome)) {
				System.out.println("Adicionando: "+ nome + " novamente.");
			
			}else {
				System.out.println("Adicionando: "+ nome);
			}
			
			
			notifyAll();
		
		
	}
	
	public synchronized void removerUsuario(String nome) {
		
		lista.remove(nome);
		removidos.add(nome);
		System.out.println("Removendo: "+ nome);
		notifyAll();
	}
	
	public synchronized void listarUsuarios() {
		System.out.println(lista);
		//notify();
		
	}

}
