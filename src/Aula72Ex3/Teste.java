package Aula72Ex3;

public class Teste {

	public static void main(String[] args) {
		
		Impressora imp1 = new Impressora();
		
		Usuario us1 = new Usuario(imp1, 1);
		Usuario us2 = new Usuario(imp1, 2);
		Usuario us3 = new Usuario(imp1, 3);
		
		
		Thread i1 = new Thread(imp1);
		
		Thread u1 = new Thread(us1);
		Thread u2 = new Thread(us2);
		Thread u3 = new Thread(us3);
		
		//i1.start();
		
		
		
		u1.start();
		u2.start();
		u3.start();
		
	}

}
