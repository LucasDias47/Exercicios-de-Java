package Aula46Ex2;

public class Carro implements Veiculo {
	
	private String marca;
	private String ano;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	
	
	@Override
	public void exibirInfo() {
		System.out.println("Carro: Marca - " +getMarca() + " Ano "+ getAno());
		
		
	}
	
	

}
