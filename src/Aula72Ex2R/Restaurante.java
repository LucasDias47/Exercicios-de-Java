package Aula72Ex2R;

public class Restaurante {

	public static void main(String[] args) {
		
		Garcom garcom = new Garcom();
		
		Thread garcomThread = new Thread(()->{
			try {
				for (int i = 1; i <=5; i++) {
					garcom.servirPrato(i);
					Thread.sleep(500);
				}
			}catch(InterruptedException e) {
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
