package Aula69Ex1;
import java.util.Random;

public class Alive implements Runnable {

	
	private int num;


	public Alive(int num) {
	
	this.num = num;
	Thread t = new Thread(this);
	t.start();
	
	
	
	}


	@Override
	public void run() {
		
		
	}

	/*

	public void sleep() {
		Random random = new Random();
		int ran = random.nextInt(500,1500);
		
		
		
	}

*/
	

}
