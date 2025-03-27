package AulaHashSetEx3;

public class MinhaThread extends Thread{

	//Trabalho trabalho;
	Tarefa tarefa;

	public MinhaThread(Tarefa tarefa) {
		this.tarefa = tarefa;
	}
	
	public void run(){
		
		tarefa.executar();
		System.out.println(Thread.currentThread().getName()+ " finalizada.");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
