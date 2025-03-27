package Aula67Ex2R;

public class CorridaThreads {

	  public static void main(String[] args) {
	        Corredor c1 = new Corredor(1);
	        Corredor c2 = new Corredor(2);
	        Corredor c3 = new Corredor(3);

	        c1.start();
	        c2.start();
	        c3.start();

	        // Aguarda todas as threads terminarem
	        try {
	            c1.join();
	            c2.join();
	            c3.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Exibir a ordem de chegada
	        Corredor.mostrarOrdemChegada();
	    }
	
}
