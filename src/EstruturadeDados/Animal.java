package EstruturadeDados;

import java.util.Objects;

public class Animal {

	private int code;
	private String nome;
	
	public Animal(int code, String nome) {
		this.code = code;
		this.nome = nome;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Animal [code=" + code + ", nome=" + nome + "]\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(code);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return code == other.code;
	}

	
	
	
	
	
	
	
}
