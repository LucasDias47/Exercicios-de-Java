package AulaLinkedListEx2;

import java.util.LinkedList;

public class Trabalhador implements Runnable{

	private LinkedList<Tarefa> tarefas;
	
	public Trabalhador(LinkedList<Tarefa> tarefas) {
		this.tarefas = tarefas;
	
	
	}
	
	
	
	
	@Override
	public void run() {
		
		while(true) {
			Tarefa tarefa;
			
			synchronized(tarefas) {
				if (tarefas.isEmpty()) {
					break;
				}
				tarefa = tarefas.removeFirst();
			}
			
			System.out.println("Executando tarefa: "+ tarefa.getNome()
			+ " (Prioridade: " + tarefa.getPrioridade()+")");
			
			try {
				Thread.sleep(tarefa.getPrioridade().getTempoExecucao()*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}

	
}
