package Aula72Ex5;

public enum CategoriaProduto {

	ELETRONICO(10), ROUPA(5), ALIMENTO(10);

	private int percentualDesconto;
	
	CategoriaProduto(int percentualdesconto) {
		this.percentualDesconto = percentualDesconto;
	}
	
	public double aplicarDesconto(double preco) {
		return preco - (preco * percentualDesconto / 100);
	}
}
