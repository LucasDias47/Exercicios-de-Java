package Aula72Ex4;

public class Passageiro implements Runnable{

	private Plataforma plataforma;
	private int num;
	
	
	
	public Passageiro(Plataforma plataforma, int num) {
		this.plataforma = plataforma;
		this.num = num;
		
		Thread t= new Thread(this);
		//t.start();
	}



	@Override
	public void run() {
		
		try {
			for(int i = 0; i<3 ; i++) {
			
			plataforma.PassEmbarcou(num);
			Thread.sleep(1000);
			}
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
