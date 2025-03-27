package Aula72Ex4;

public class Plataforma implements Runnable{

	private int tremAtual = 0;
	private boolean tremDisponivel = false;
	private int passageirosNoTrem =0;
	private final int capacidadeTrem =2;
	
	//private int [] passEmbarcados;
	
	public Plataforma() {
		
		Thread t = new Thread(this);
		t.start();
	}

	public synchronized void tremChegou(int trem) throws InterruptedException{
		
		while(tremDisponivel) {
			wait();
		}
		
		tremAtual = trem;
		tremDisponivel =true;
		passageirosNoTrem =0;
		System.out.println("Trem " + trem + " chegou à plataforma.");
		
		notifyAll();
	}
	
	public synchronized void PassEmbarcou(int Passenger) throws InterruptedException{
		
		while(!tremDisponivel || passageirosNoTrem >= capacidadeTrem) {
			wait();
		}
		
		System.out.println("Passenger "+ Passenger + " embarcou no Trem "+ tremAtual);
		passageirosNoTrem+=1;
		/*
		passEmbarcados[0] = passEmbarcados[3];
		
		for(int i = 0;i<passEmbarcados.length;i++) {
		
			passEmbarcados[i]= Passenger;
		
		}
		*/
		tremDisponivel = true;
		notifyAll();
	}
	
	public synchronized void tremPartiu (int trem)throws InterruptedException{
		
		while(!tremDisponivel|| passageirosNoTrem < capacidadeTrem) {
			wait();
		}
		
		tremAtual = trem;
		tremDisponivel = false;
		System.out.println("Trem " + trem + " partiu da estação com " + passageirosNoTrem + " passageiros.");
		
		notifyAll();
		
		
	}
	
	@Override
	public void run() {
		
		for(int i = 1;i<3; i++) {
			
			try {
				tremChegou(i);
				Thread.sleep(500);
				
				
					tremPartiu(i);
				
				
				
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		
	}
	
}
