package Aula72Ex2;

public class Cliente implements Runnable{

	private int num;
	
	
	
	public Cliente(int num) {
		this.num = num;
		
		Thread t = new Thread(this);
		t.start();
		
	}



	@Override
	public void run() {
		
		//Cliente cliente = new Cliente();
		Garçom garcom = new Garçom();
		
		garcom.servirPrato(true);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		garcom.receberPrato(num, false);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
