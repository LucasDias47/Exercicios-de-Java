package Aula72Ex2;



	class Garcom {
	    private int[] pratos = new int[1]; // Apenas 1 prato por vez
	    private boolean pratoDisponivel = false;

	    public synchronized void servirPrato(int prato) throws InterruptedException {
	        while (pratoDisponivel) {
	            wait(); // Espera até que o cliente pegue o prato
	        }
	        pratos[0] = prato;
	        pratoDisponivel = true;
	        System.out.println("Garçom: Prato " + prato + " está pronto!");
	        notifyAll(); // Notifica os clientes
	    }

	    public synchronized void receberPrato(int clienteNum) throws InterruptedException {
	        while (!pratoDisponivel) {
	            wait(); // Espera até que o garçom sirva um prato
	        }
	        System.out.println("Cliente " + clienteNum + " pegou o Prato " + pratos[0]);
	        pratoDisponivel = false;
	        notifyAll(); // Notifica o garçom para preparar outro prato
	    }
	}

	class Cliente extends Thread {
	    private Garcom garcom;
	    private int num;

	    public Cliente(int num, Garcom garcom) {
	        this.num = num;
	        this.garcom = garcom;
	    }

	    public void run() {
	        try {
	            garcom.receberPrato(num);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}

	class Restaurante {
	    public static void main(String[] args) {
	        Garcom garcom = new Garcom();

	        Thread garcomThread = new Thread(() -> {
	            try {
	                for (int i = 1; i <= 5; i++) {
	                    garcom.servirPrato(i);
	                    Thread.sleep(500);
	                }
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

	        Cliente c1 = new Cliente(1, garcom);
	        Cliente c2 = new Cliente(2, garcom);
	        Cliente c3 = new Cliente(3, garcom);
	        Cliente c4 = new Cliente(4, garcom);
	        Cliente c5 = new Cliente(5, garcom);

	        garcomThread.start();
	        c1.start();
	        c2.start();
	        c3.start();
	        c4.start();
	        c5.start();
	    }
	}

	

