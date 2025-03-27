package Aula72Ex5;

public class Produto implements Desconto{
	
	private String nome;
	private static Double preco;
	private CategoriaProduto categoria;
	
	public Produto(String nome, Double preco, CategoriaProduto categoria) {
		this.nome = nome;
		this.preco = preco;
		this.categoria = categoria;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public CategoriaProduto getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaProduto categoria) {
		this.categoria = categoria;
	}
	
	public static double calcularDesconto(){
		return preco;
		
	}
	
	
	

}
