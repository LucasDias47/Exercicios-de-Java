package Aula43Ex2;

public class PessoaJuridica extends Contribuinte{
	
	private String cnpj;
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public void CalcularImposto() {
		
		System.out.println("Digite o nome do contribuinte: ");
		setNome(scan.next());
		
		System.out.println("Digite a renda bruta: ");
		setRendaBruta(scan.nextDouble());
		
		setAliquota(10);
		
		setValorAserPago((getRendaBruta()*getAliquota())/100);
		
		
		/*
		System.out.println("Nome: " + getNome());
		System.out.println("O valor da parcela é " + getParcelaAdeduzir());
		*/
	}

	@Override
	public String toString() {
		String s = "Pessoa Juridica:";
		s += super.toString();
		//s += "]";
		
		return s;
	}

	/*
	
	@Override
	public String toString() {
		String s = "ContaPoupança[";
		s += " diaRendimento: " + diaRendimento;  
		s += super.toString();
		s += "]";
		return s;
		
	
	
	*/
}
