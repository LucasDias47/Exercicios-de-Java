package Aula72Ex5;

public class ProdutoEspecial extends Produto{

	private double bonus;
	
	public ProdutoEspecial(String nome, Double preco, CategoriaProduto categoria, double bonus) {
		super(nome, preco, categoria);
		this.bonus = bonus;
	}
	
	public double getBonus() {
		return bonus;
	}
	

}
