package Aula71Ex3;

public class SincronizandoDados implements Runnable{

	private  String num;


	public SincronizandoDados( String  num) {
		this.num = num;

		Thread t = new Thread(this);
	}


	@Override
	public void run() {

		System.out.println("Thread " + num + ": Sincronizando dados...");
		
		SincronizandoDados sincronizandoDados = new SincronizandoDados(null);
		sincronizandoDados.sincDados();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Thread " + num + ": finalizada.");

	}

	public  synchronized void sincDados() {
		for (int i = 0; i<5;i++) {


			System.out.println("Quantidade de dados sincronizados da  " + Thread.currentThread().getName() + ": "+i);

		}
	}

}


