package Aula68Ex2;

public class Contador2 implements Runnable{

	
	public Contador2(){
		Thread t = new Thread(this);
		t.start();
		
	}
	@Override
	public void run() {
		

		try {
			
			//for (int i = 0 ;i<6;i++) {
				
			//}
			
			
			
			for(int i = 1; i<3 ;i++) {
				
				Thread.sleep(5000);
				System.out.println("5 segundos se passaram");
				
			}
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

		
		
	}

}
