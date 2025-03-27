package Ex4;

public class Teste {

	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria();
		
		Thread c1 = new Thread(new Cliente(conta,"João"), "João");
		Thread c2 = new Thread(new Cliente(conta,"Ana "), "Ana");
		Thread c3 = new Thread(new Cliente(conta, "Pedro"), "Pedro");
		
		c1.start();
		c2.start();
		c3.start();
	}

}
