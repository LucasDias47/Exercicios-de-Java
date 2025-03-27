package AulaArrayListEx3;

import java.util.ArrayList;
import java.util.List;


public class FilaDeAnimais {
	
	private final List<String> fila = new ArrayList<>();
	
	public synchronized void adicionarAnimal(String animal) {
		fila.add(animal);
		System.out.println("Adicionando animal à fila: "+ animal);
		
		notify();
		
	}

	public synchronized String removerAnimal() throws InterruptedException{
		
		while (fila.isEmpty()) {
			System.out.println("Fila vazia! Aguardando novos animais...");
		wait();
		}
		
		String animal = fila.remove(0);
		System.out.println("Removendo animal da fila: "+ animal);
		return animal;
	}

	

	
	
}
