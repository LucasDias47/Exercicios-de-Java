package Aula72Ex3;

public class Usuario implements Runnable{

	private Impressora impressora;
	private int num;
	
	
	
	public Usuario(Impressora impressora, int num) {
		this.impressora = impressora;
		this.num = num;
		
		Thread t = new Thread(this);
	}

	@Override
	public void run() {
		
		try {
			impressora.pegarDocumento(num);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
