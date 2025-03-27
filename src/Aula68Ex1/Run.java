package Aula68Ex1;

public class Run implements Runnable {

	private String nome;
	private int tempo = 500;
	
	
	
	public Run(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		Thread t = new Thread(this);
		t.start();
	}



	@Override
	public void run() {
		
		try {
			
			for (int i=0; i<6;i++) {
				System.out.println("Thread "+nome+ ": "+i);
				Thread.sleep(tempo);
			}
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
