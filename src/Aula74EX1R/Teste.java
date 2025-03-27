package Aula74EX1R;

public class Teste {

	public static void main(String[] args) {

		ContadorCompartilhado contador = new ContadorCompartilhado();

		Thread t1 = new MinhaThread(contador);
		Thread t2 = new MinhaThread(contador);
		Thread t3 = new MinhaThread(contador);

		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Contador final: "+ contador.getContador());

	}

}
