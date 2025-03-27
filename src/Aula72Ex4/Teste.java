package Aula72Ex4;

public class Teste {

	public static void main(String[] args) {
		
		Plataforma pl1 = new Plataforma();
		
		Passageiro pa1 = new Passageiro(pl1,1);
		Passageiro pa2 = new Passageiro(pl1,2);
		Passageiro pa3 = new Passageiro(pl1,3);
		Passageiro pa4 = new Passageiro(pl1,4);
		
		Thread p1 = new Thread(pl1);
		
		Thread paa1 = new Thread(pa1);
		Thread paa2 = new Thread(pa2);
		Thread paa3 = new Thread(pa3);
		Thread paa4 = new Thread(pa4);
		
		paa1.start();
		paa2.start();
		paa3.start();
		paa4.start();
		

	}

}
