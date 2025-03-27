package Aula68Ex2;

public class Contador implements Runnable{

	public Contador(){
	Thread t = new Thread(this);
	t.start();

	
	}
	

	@Override
	public void run() {

		try {
			
			for(int i = 1; i<11 ;i++) {
				System.out.println(i +" segundos");
				Thread.sleep(1000);
			}
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}


	}


	
}
