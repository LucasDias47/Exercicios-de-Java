package Aula69Ex4;

public class Processo implements Runnable{

	private int num;
	
	
	
	public Processo(int num) {
		this.num = num;
		
		Thread t = new Thread(this);
	}



	@Override
	public void run() {
		System.out.print("Thread "+ num+" ");
		//System.out.print("processando depósito...");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
