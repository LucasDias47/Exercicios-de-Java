package Aula72Ex2R;

public class Cliente extends Thread {

	private Garcom garcom;
	private int num;
	
	public Cliente(int num, Garcom garcom) {
		this.num = num;
		this.garcom = garcom;
	}
	
	public void run() {
		try {
			garcom.receberPrato(num);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
