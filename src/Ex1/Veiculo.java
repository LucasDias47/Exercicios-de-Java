package Ex1;

public class Veiculo {
	
	private String nome;
	private String modelo;
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public int hashCode() {
		return nome.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Veiculo veiculo = (Veiculo) obj;
		return nome.equals(veiculo.nome);
	}
	
	public void acelerar() {
		
	}

}
