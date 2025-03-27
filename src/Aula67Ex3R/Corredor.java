package Aula67Ex3R;
import java.util.Random;


public class Corredor  extends Thread{
	
	private int numero;
    private static int[] ordemChegada = new int[3]; // Array para armazenar ordem de chegada
    private static int posicao = 0; // Controla a posição no array

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

        // Armazena a ordem de chegada no array
        ordemChegada[posicao] = numero;
        posicao++;

        System.out.println("Corredor " + numero + " terminou a corrida!");
    }
    
    public static void mostrarOrdemChegada() {
        System.out.println("\n🏆 Ordem de chegada:");
        for (int i = 0; i < ordemChegada.length; i++) {
            System.out.println((i + 1) + "º lugar: Corredor " + ordemChegada[i]);
        }
    }


}
