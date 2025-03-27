package Aula52Ex2;

public class IdadeInvalida extends Exception{
	
	private int idade;

	public IdadeInvalida(int idade) {
		super();
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Erro: Idade inválida! A idade deve ser um número positivo e menor que 150.";
	}
	
	

}
