package Ex3;

public class Teste {

	public static void main(String[] args) {
		
		FilaAtendimento filaAtendimento = new FilaAtendimento();
		
		Thread produtor = new Thread(() -> {
			int c = 1;
			
			while(c<6) {
				filaAtendimento.adicionarPedido("Pedido " + c);
				c++;
			
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					Thread.currentThread().interrupt();
				}
			}
		});
		
		Thread consumidor = new Thread(() -> {
			
			filaAtendimento.processarPedido();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
				Thread.currentThread().interrupt();
			}	
			
			
		});
		
		produtor.start();
		consumidor.start();

	}
	
	// lt bt ;lmin 0,52;  sat;0,26 
	// dl ;rmin 0,26 ; lmin 0,36; sat;0,15
	//cdi rmin 0,15,
	
	// lt bt ;lmin 0,78;  sat;0,62 
		// dl ;rmin 0,16 ; lmin 0,26; sat;0,25
		//cdi rmin 0,10,
	
	

}
