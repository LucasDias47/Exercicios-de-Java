package Aula72;

public class TiqueTaque {

	boolean tique;

	synchronized void tique(boolean estaExecutando) {

		if(!estaExecutando) {
			tique = true;
			notify();
			return;
		}

		System.out.print("Tique ");

		tique = true;

		notify();

		while (tique) {

			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	
	}

	synchronized void taque(boolean estaExecutando) {

		if(!estaExecutando) {
			tique = false;
			notify();
			return;
		}

		System.out.println("Taque ");

		tique = false;

		notify();

		 while (!tique) {
	            try {
	                wait();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }

	        //notify(); // Notifica a outra thread APÓS esperar
	    }
	}