package Ex7;

public class Teste {

	public static void main(String[] args) {
		
		GerenciadorPedidos ger = new GerenciadorPedidos();
		
		Thread adc = new Thread (()->{
			
			ger.adicionarPedido(1, "João");
			ger.adicionarPedido(2, "Maria");
			
		});
		
		Thread pr = new Thread(()->{
			
			ger.processarPedido(1, "João");
			ger.processarPedido(2, "Maria");
		});
		
		Thread ent = new Thread(()-> {
			
			ger.entregarPedido(1, "João");
			ger.entregarPedido(2, "Maria");
			
		});
		
		
		adc.start();
		
		try {
			adc.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			adc.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pr.start();
		try {
			pr.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		
		ent.start();
		
		try {
			ent.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		System.out.println("Todos os pedidos foram processados!");
		

	}

}
