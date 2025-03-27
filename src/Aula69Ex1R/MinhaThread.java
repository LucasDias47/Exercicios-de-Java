package Aula69Ex1R;

public class MinhaThread extends Thread{
	
	private int id;
	
	public MinhaThread(int id) {
		this.id = id;
	}
	
	public void run() {
		
		System.out.println("Thread " + id + " está em execução...");
		try {
			
			Thread.sleep(500 + (int) (Math.random()*1000));
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread " + id + " finalizou.");
	}

}
