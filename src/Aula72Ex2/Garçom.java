package Aula72Ex2;

public class Garçom {

	private  int[] capacidade = new int[5];

	public synchronized void servirPrato(boolean servindo){

		for(int i = 1;i<capacidade.length;i++) {
			
			while(servindo == false) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			System.out.println("Garçom: Prato "+i + " está pronto!");
			servindo = true;
			notifyAll();

		}
		
		

	}
		public synchronized void receberPrato(int num, boolean servindo) {
			while (servindo == true) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
			for(int i = 1;i<capacidade.length;i++) {
				System.out.println("Cliente "+ num+ " pegou o prato " +i);
				servindo = false;
				notifyAll();
			} 
			
		}	

	}

