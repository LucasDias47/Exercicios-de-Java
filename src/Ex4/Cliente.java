package Ex4;

import java.util.Random;

public class Cliente implements Runnable{
	
	private ContaBancaria conta;
	private String nome;

	
	
	
	
	public Cliente(ContaBancaria conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}

	@Override
	public void run() {
		
		Random random = new Random();
		
		for(int i = 0; i<3;i++) {
		
		int valor = random.nextInt(50)+1;
		
		if(random.nextBoolean()) {
			
			conta.depositar(valor);
		}else {
			conta.sacar(valor);
		}
		
		}
		
		
		
	}
	
	
	

}
