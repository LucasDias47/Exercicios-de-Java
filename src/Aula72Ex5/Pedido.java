package Aula72Ex5;
import java.util.Arrays;

public class Pedido {

	private Produto[] produtos;
	
	public Pedido(Produto...produtos) {
		
		if (produtos == null || produtos.length ==0) {
			throw new IllegalArgumentException("O pedido deve conter pelo menos um produto.");
		}
		this.produtos = produtos;
	}
	
	public double calcularTotal() {
		
		double total = 0;
		for (Produto p : produtos) {
			total += p.calcularDesconto();
		}
		return total; 
	}
	
	public void listarProdutos() {
		
		if(produtos == null) {
			System.out.println("Nenhum produto disponível.");
			return;
		}
		
		Arrays.stream(produtos).forEach(p ->
		System.out.println("Produto encontrado: "+ p.getNome() + " - R$ " + p.getPreco()));
	}
	
	
}
