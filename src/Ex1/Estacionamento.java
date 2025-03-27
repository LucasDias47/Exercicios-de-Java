package Ex1;

import java.util.HashSet;

import java.util.Set;

public class Estacionamento{

	private final int capacidadeMaxima;
	private final Set<Veiculo> veiculosEstacionados;
	
	
	
	
	public Estacionamento(int capacidadeMaxima) {
		
		this.capacidadeMaxima = capacidadeMaxima;
		this.veiculosEstacionados = new HashSet<>();
	}

	public synchronized void estacionar(Veiculo v)throws InterruptedException{
		
		while (veiculosEstacionados.size() >= capacidadeMaxima) {
			System.out.println("Estacionamento cheio! "+ v.getNome()+ " está esperando...");
			wait();
			
		}
		
		if(veiculosEstacionados.contains(v)) {
			System.out.println(v.getNome() + "já está estacionado!");
			return;
		}
		
		veiculosEstacionados.add(v);
		System.out.println(v.getNome()+ " entrou no estacionamento.");
		notifyAll();
		
	}
	
		public synchronized void sairDoEstacionamento(Veiculo v) {
			if(veiculosEstacionados.remove(v)) {
				System.out.println(v.getNome() + " saiu do estacionamento.");
				notifyAll();
			} else {
				System.out.println(v.getNome() + "não estava estacionado.");
			}
			
		}
	
	
	

}
