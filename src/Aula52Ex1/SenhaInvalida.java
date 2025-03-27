package Aula52Ex1;

public class SenhaInvalida extends Exception {
	
	private String senha;

	public SenhaInvalida(String senha) {
		super();
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Erro: A senha deve ter pelo menos 8 caracteres, uma letra maiúscula e um número. ";
	}
	
	

}
