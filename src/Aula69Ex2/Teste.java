package Aula69Ex2;

public class Teste {

	public static void main(String[] args) {

		MinhaThreadEX thread1 = new MinhaThreadEX(1);
		MinhaThreadEX thread2 = new MinhaThreadEX(2);
		MinhaThreadEX thread3 = new MinhaThreadEX(3);

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);

		t1.start();
		
		if(t1.isAlive()==true) {
		
		t2.start();
		
		}

		if (t2.isAlive()==true) {
		
		t3.start();
		}





		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}





		try {

			//if(t1.isAlive()==false) {	
				t2.join();
			//}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		 
		System.out.println("Todas as threads foram finalizadas!");




	}

}
