package Aula43Ex2;

public class PessoaFisica extends Contribuinte{
	
	private String cpf;
	

	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	@Override
	public String toString() {
		
		String s = "Pessoa Física: ";
		s += super.toString();
		return s;
	}
	
	

}
