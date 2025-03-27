package Aula70;

public class MinhaThreadRunnable implements Runnable{

	private String nome;
	private int tempo;
	

	public MinhaThreadRunnable(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		
		//Thread t = new Thread(this);//pode instanciar aqui ou na classe teste sem o this
		//t.start();
	}

	@Override
	public void run() {

		try {
			for(int i = 0; i<6; i++) {
				System.out.println(nome + " contador "+ i);


				Thread.sleep(tempo);
			}
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(nome + " terminou a execução");
		}

	}


