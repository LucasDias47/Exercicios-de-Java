package Aula52Ex3;

public class NomeCurto extends Exception{
	
	private String nome;

	public NomeCurto(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Erro: O nome deve ter pelo menos 3 caracteres. ";
	}
	
	

}
