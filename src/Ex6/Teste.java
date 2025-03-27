package Ex6;

public class Teste {

	public static void main(String[] args) {
		
		Loja loja = new Loja();
		
		Thread adc = new Thread(()->{
		
		loja.adicionarPedidos(1, "João");
		loja.adicionarPedidos(2, "Maria");
		loja.adicionarPedidos(3, "Ana");
		
		});
		
		Thread prod = new Thread(()->{
		
		loja.processarPedidos(1,"João");
		loja.processarPedidos(2, "Maria");
		loja.processarPedidos(3, "Ana");
		
		});
	
		adc.start();
		prod.start();
		
		try {
			adc.join();
			prod.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//System.out.println("Lista de clientes ordenados: ");
		//System.out.println(loja.getClientes());
		loja.imprimirNomes();
	}
	
	

}
