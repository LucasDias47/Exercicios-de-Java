package Aula67Ex2R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Corredor extends Thread {

	  private int numero;
	    private static List<Integer> ordemChegada = new ArrayList<>();
	    private static final Object lock = new Object();

	    public Corredor(int numero) {
	        this.numero = numero;
	    }

	    @Override
	    public void run() {
	        Random random = new Random();

	        for (int i = 1; i <= 10; i++) {
	            System.out.println("Corredor " + numero + ": Passo " + i);
	            try {
	                Thread.sleep(random.nextInt(1000) + 500); // Tempo entre 500ms e 1500ms
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }

	        // Registrar a ordem de chegada de forma segura entre threads
	        synchronized (lock) {
	            ordemChegada.add(numero);
	        }

	        System.out.println("Corredor " + numero + " terminou a corrida!");
	    }
	    
	    public static void mostrarOrdemChegada() {
	        System.out.println("\n🏆 Ordem de chegada:");
	        for (int i = 0; i < ordemChegada.size(); i++) {
	            System.out.println((i + 1) + "º lugar: Corredor " + ordemChegada.get(i));
	        }
	    }
	}
	

