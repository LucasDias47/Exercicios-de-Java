package AulaHashSetEx3;

import java.util.HashSet;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.Set;

public class Teste {

	public static void main(String[] args) {
		
		Tarefa ta1 = new TarefaA();
		Tarefa ta2 = new TarefaA();
		
		Tarefa ta3 = new TarefaB();
		Tarefa ta4 = new TarefaB();
		
		Set<Tarefa> tarefas = new HashSet<>();
		
		tarefas.add(ta1);
		tarefas.add(ta2);
		tarefas.add(ta3);
		tarefas.add(ta4);
		
		for(Tarefa t : tarefas) {
			t.executar();
		}
		
		/*
		MinhaThread t1 = new MinhaThread(ta1);
		MinhaThread t2 = new MinhaThread(ta2);
		MinhaThread t3 = new MinhaThread(ta3);
		MinhaThread t4 = new MinhaThread(ta4);
		*/
		
		ArrayList<MinhaThread> threads = new ArrayList<>();
		
		for ( Tarefa i : tarefas) {
			MinhaThread thread = new MinhaThread(i);
			threads.add(thread);
			thread.start();	
		}
		
		for(MinhaThread thread : threads) {
			
			try {
				thread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("Finalizado!");
		
		
		/*
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
		System.out.println(t4.isAlive());
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*
		
		Iterator<Tarefa>it = tarefas.iterator();
		
		while(it.hasNext()) {
			it.next();
			it.exe
		}
		
		 */
	}

}
