package Aula72Ex5;

public class Teste {

	public static void main(String[] args) {
		
		Produto notebook = new Produto("Notebook",3500.0, CategoriaProduto.ELETRONICO);
		Produto camiseta = new Produto("Camiseta",50.0, CategoriaProduto.ROUPA);
		Produto pao = new Produto("Pão",5.0, CategoriaProduto.ALIMENTO);

		Produto produtoEspecial = new ProdutoEspecial("TV 4K", 5000.0, CategoriaProduto.ELETRONICO, 300.0);
		
		if (produtoEspecial instanceof ProdutoEspecial) {
			ProdutoEspecial pe = (ProdutoEspecial) produtoEspecial;
			System.out.println("Bônus do produto especial: R$ " + pe.getBonus());
		}
		
		Pedido pedido1 = new Pedido(notebook, camiseta, pao);
		Pedido pedido2 = new Pedido(produtoEspecial);
		
		ProcessadorPedido thread1 = new ProcessadorPedido(pedido1, "João");
		ProcessadorPedido thread2 = new ProcessadorPedido(pedido2, "Maria");
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("[THREAD] Todos os pedidos foram processados.");
		
		
	}

}
