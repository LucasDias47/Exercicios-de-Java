package Aula69Ex3;

public class Download implements Runnable{

	private int num;
	private int sl;
	
	
	
	public Download(int num, int sl) {
		this.num = num;
		this.sl = sl;
	}



	@Override
	public void run() {
		
		System.out.println("Download do Arquivo " + num + " iniciado...");
		
		try {
			Thread.sleep(sl);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Download do Arquivo " + num + " concluído...");
		
	}

}
