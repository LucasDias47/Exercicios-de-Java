package Aula69Ex1;

import java.util.Random;

public class Teste {

	public static void main(String[] args) {

		Random random = new Random();
		int ran = random.nextInt(50,150);

		Alive al1 = new Alive(1);
		Thread a1 = new Thread(al1);
		
		System.out.println("Thread 1 está em execução...");

		try {
			Thread.sleep(ran);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Alive al2 = new Alive(2);
		Thread a2 = new Thread(al2);
		
		System.out.println("Thread 2 está em execução...");
		try {
			Thread.sleep(ran);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			/*

			Alive al3 = new Alive(3);
			Thread a3 = new Thread(al3);
			
			System.out.println("Thread 3 está em execução...");
			try {
				Thread.sleep(ran);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			*/
				System.out.println("Verificando se as threads estão vivas...");
				System.out.println("Thread 1 está viva? " + a1.isAlive());
				

			}

		}

	}
	
}
