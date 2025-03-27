package Aula71Ex1;

public class ThreadContador implements Runnable{

	private String nome;
	private int[] nums;
	
	private static Contador cont =new Contador();
	
	
	
	public ThreadContador(String nome, int[] nums) {
		this.nome = nome;
		this.nums = nums;
		new Thread(this, nome).start();
	}



	@Override
	public void run() {
		
		int con = cont.Incrementar(this.nums);
		int res = cont.mostrarValor();
		
		
	}
	
	

}
