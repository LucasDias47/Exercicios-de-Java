package Aula70Ex2;

public class Teste {

	public static void main(String[] args) {
		
		Prioridade prior1 = new Prioridade("A");
		Prioridade prior2 = new Prioridade("B");
		Prioridade prior3 = new Prioridade("C");
		
		Thread p1 = new Thread(prior1);
		Thread p2 = new Thread(prior2);
		Thread p3 = new Thread(prior3);
		
		p1.setPriority(Thread.MAX_PRIORITY);
		p2.setPriority(Thread.NORM_PRIORITY);
		p3.setPriority(Thread.MIN_PRIORITY);
		
		p1.start();
		p2.start();
		p3.start();

	}

}
