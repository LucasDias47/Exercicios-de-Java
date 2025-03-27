package Aula67Ex2;

import java.util.Random;

public class Corrida extends Thread{

	private int num;

	public int getNum() {
		return num;
	}

	//private int passo;
	private int tempo;



	public void setTempo(int tempo) {
		int v = 0;

		Random random = new Random();
		v = random.nextInt(500,1500);


		this.tempo = v;
	}

	public Corrida(int num, int tempo) {
		this.num = num;
		//this.passo = passo;
		this.tempo = tempo;
		start();
	}

	public void run() {

		int chegada[]= new int[3]; 
		/*
		Random random = new Random();

		int v = random.nextInt(500,1500);

		setTempo(v);
		 */
		try {

			for(int i = 0; i<11 ; i++) {
				System.out.println("Corredor " + num +": Passo "+ i);
				Thread.sleep(tempo);

				if (i==10) {
					System.out.println("Corredor " + num +" terminou a corrida!");
				}

				if (i==10 && chegada[0]==0) {

					chegada[0]=num;

				}else if(i==10 && chegada[0]!=0 && chegada[1]==0  ) {
					chegada[1]=num;

				}else if(i==10 && chegada[0]!=0 && chegada[1]!=0 && chegada[2]==0 ) {
					chegada[2]=num;

				}


				//System.out.println("...");
				//System.out.println("Corredor " + num +" terminou a corrida!");
				//System.out.print("Ordem de chegada: ");

				//System.out.print(num+" ->");

			}

		}catch(InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Ordem de chegada: ");
		System.out.println(chegada[0]+" ->" + chegada[1]+ " ->" + chegada[2]);

	}

}

