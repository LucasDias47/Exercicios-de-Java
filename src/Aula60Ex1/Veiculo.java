package Aula60Ex1;

public class Veiculo {

	private String marca;
	private String modelo;
	private int ano;
	private Categoria categoria;
	
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	
	public Veiculo(String marca, String modelo, int ano, Categoria categoria) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.categoria = categoria;
	}
	
	public String mostrarDetalhes() {
double precoBase = 0;
		
		Categoria[] cat = Categoria.values();
		for(Categoria c : cat) {
		
			if(c == Categoria.ECONOMICO) {
			precoBase = 877700;
			
			}
			
		}
		double precoFinal = getCategoria().calcularPrecoFinal(precoBase)	;	
		
		return "Detalhes do carro:" + getMarca() + " " + getModelo() + " - " + getAno() + " - Categoria: " + getCategoria() +" - Preço Final: " +precoFinal  ;
	}
	
	
	
}
