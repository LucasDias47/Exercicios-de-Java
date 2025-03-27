package Aula69Ex3;

public class Teste {

	public static void main(String[] args) {
		
		Download down1 = new Download(1,3000);
		Download down2 = new Download(2,5000);
		Download down3 = new Download(3,2000);
		
		Thread d1 = new Thread(down1);
		Thread d2 = new Thread(down2);
		Thread d3 = new Thread(down3);
		
		d1.start();
		d2.start();
		d3.start();
		
		
		/*
		if (d1.isAlive()==true);
		System.out.println("Download do Arquivo 1 em andamento");
		
		if (d2.isAlive()==true);
		System.out.println("Download do Arquivo 2 em andamento");
		
		if (d3.isAlive()==true);
		System.out.println("Download do Arquivo 3 em andamento");
		*/
		
		
		try {
			d1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			d2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			d3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Todos os arquivos foram baixados com sucesso!");
	}

}
