package Aula71Ex1R;

public class Teste {
	
	public static void main(String[] args) {

		Contador contador = new Contador();
		
		Runnable tarefa =() ->{
			
			for (int i = 0; i<5;  i++) {
				
				contador.incrementar();
				//contador.mostrarValor();
				
				
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				
			}
		};
		
		Thread t1 = new Thread(tarefa, "Thread- 1");
		Thread t2 = new Thread(tarefa, "Thread- 2");
		Thread t3 = new Thread(tarefa, "Thread- 3");
		Thread t4 = new Thread(tarefa, "Thread- 4");
		Thread t5 = new Thread(tarefa, "Thread- 5");
		Thread t6 = new Thread(tarefa, "Thread- 6");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		
		System.out.println("Testando...........");

	}
}



