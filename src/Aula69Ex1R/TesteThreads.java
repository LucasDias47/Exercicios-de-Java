package Aula69Ex1R;

public class TesteThreads {

	public static void main(String[] args) {
		
		MinhaThread t1 = new MinhaThread(1);
		
		MinhaThread t2 = new MinhaThread(2);
		
		MinhaThread t3 = new MinhaThread(3);
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			Thread.sleep(200);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Verificando se as threads estão vivas... ");
		System.out.println("Thread 1 está viva? "+ t1.isAlive());
		System.out.println("Thread 2 está viva? "+ t2.isAlive());
		System.out.println("Thread 3 está viva? "+ t3.isAlive());
		
		try {
			t1.join();
			t2.join();
			t3.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Verificando novamente... ");
		System.out.println("Thread 1 está viva? "+ t1.isAlive());
		System.out.println("Thread 2 está viva? "+ t2.isAlive());
		System.out.println("Thread 3 está viva? "+ t3.isAlive());

	}

}
