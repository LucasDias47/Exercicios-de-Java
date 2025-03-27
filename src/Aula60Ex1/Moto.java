package Aula60Ex1;

public class Moto extends Veiculo {
	
	public Moto(String marca,String modelo, int ano, Categoria categoria) {
		super(marca, modelo, ano, categoria);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String mostrarDetalhes() {
	
		double precoBase = 0;
		
		Categoria[] cat = Categoria.values();
		for(Categoria c : cat) {
		
			if(c == Categoria.ECONOMICO) {
			precoBase = 877700;
			
			}
			
		}
		double precoFinal = getCategoria().calcularPrecoFinal(precoBase)	;	
		
		
		return "Detalhes da moto:" + getMarca() + " " + getModelo() + " - " + getAno() + " - Categoria: " +getCategoria()  +" Preço Final: "+ precoFinal;
	}

}
