package Ex2;

public class ContaBancaria {

	private String numeroConta;
	private double saldo;
	
	
	
	
	public ContaBancaria(String numeroConta, double saldo) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double valor) {
		
		System.out.println("Depositando " + valor);
		setSaldo(getSaldo()+valor);
		
		
	}
	
	public void sacar(double valor) {
		
		if(valor <= getSaldo()) {
			setSaldo(getSaldo()-valor);
			System.out.println("Saque de "+ valor + " realizdado com sucesso na Conta "+getNumeroConta());
			
		}else {
			System.out.println("Saque inválido");
		}
		
	}
}
