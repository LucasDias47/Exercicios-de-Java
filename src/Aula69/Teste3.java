package Aula69;

public class Teste3 {
	
	public static void main(String[] args) {

		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1",500);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2",700);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3",800);

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);

		t1.start();
		
		/*
		try {
			t1.join(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		t2.start();
		
		/*
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		t3.start();
		/*
		try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		try {
		
		t1.join();
		t2.join();
		t3.join();
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Programa finalizado");
	}


}
