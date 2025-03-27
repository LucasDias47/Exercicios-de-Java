package AulaLinkedListEx2;

import java.util.LinkedList;

public class Teste {

	public static void main (String args[]) {
	
	Tarefa ta1 = new Tarefa();
	Tarefa ta2 = new Tarefa();
	Tarefa ta3 = new Tarefa();
	
	ta1.setNome("Revisar código");
	ta1.setPrioridade(TarefaTipo.ALTA);
	
	ta2.setNome("Escrever documentação");
	ta2.setPrioridade(TarefaTipo.MEDIA);
	
	ta3.setNome("Atualizar dependências");
	ta3.setPrioridade(TarefaTipo.BAIXA);
	
	LinkedList<Tarefa> tarefas = new LinkedList<>();
	
	tarefas.add(ta1);
	tarefas.add(ta2);
	tarefas.add(ta3);
	
	Trabalhador tr1 = new Trabalhador(tarefas);
	Trabalhador tr2 = new Trabalhador(tarefas);
	Trabalhador tr3 = new Trabalhador(tarefas);
	
	Thread t1 = new Thread(tr1);
	Thread t2 = new Thread(tr2);
	Thread t3 = new Thread(tr3);
	
	t1.start();
	t2.start();
	t3.start();
	
	try {
		t1.join();
		t2.join();
		t3.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Todas as tarefas foram concluídas");
	
	
	
	}
}
