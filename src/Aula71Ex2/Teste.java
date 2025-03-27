package Aula71Ex2;

public class Teste {

	public static void main(String[] args) {
		
		Contador contador = new Contador();
		
		Runnable tarefa1 =()->{
			
			for(int i = 0;i<6;i++) {
				contador.incrementar();
				contador.exibirValor();
			}
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};

		Runnable tarefa2 =() ->{
			
			for(int i = 0;i<6;i++) {
				contador.decrementar();
				contador.exibirValor();
			}
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		
		
		
		Runnable tarefa3 =() ->{
			
			
			try {
				
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("...");
			contador.exibirValorFinal();
		
		};
		
		Thread t1 = new Thread(tarefa1);
		Thread t2 = new Thread(tarefa2);
		Thread t3 = new Thread(tarefa3);
		
		t1.start();
		t2.start();
		
		/*
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		*/
		
		
		t3.start();
		
		//contador.exibirValorFinal();
	}
	

}
