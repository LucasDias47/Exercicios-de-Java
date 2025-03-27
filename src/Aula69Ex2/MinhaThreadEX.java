package Aula69Ex2;

public class MinhaThreadEX implements Runnable{

	private int num;
	
	
	public MinhaThreadEX(int num) {
		this.num = num;

		
		Thread t = new Thread(this);
		//t.start();
	}
	
	@Override
	public void run() {
		
		System.out.println("Thread " + num + " começou!");
		
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Thread " + num + " terminou!");
		
	}

}
