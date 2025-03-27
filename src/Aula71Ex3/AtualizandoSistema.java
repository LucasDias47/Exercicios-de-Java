package Aula71Ex3;

public class AtualizandoSistema implements Runnable{

	private int num;
	
	
	public AtualizandoSistema(int num) {
		this.num = num;
		
		Thread t = new Thread(this);
	}


	@Override
	public void run() {
		
		System.out.println("Thread " + num + ": Atualizando sistema...");
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thread " + num + ": finalizada.");
		
		
	}

}
