package Aula72Ex5;

public class ProcessadorPedido extends Thread{

	private Pedido pedido;
	private String cliente;
	
	
	
	public ProcessadorPedido(Pedido pedido, String cliente) {
		this.pedido = pedido;
		this.cliente = cliente;
		
		//Thread t= new Thread(this);
	}

	@Override
	public void run() {
		System.out.println("[THREAD] Processando pedido para Cliente: "+ cliente);
		try {
			
			Thread.sleep(1000);
			pedido.listarProdutos();
			System.out.println("Total do pedido para "+ cliente + ": R$ "+ pedido.calcularTotal());
		
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

	
}
