package Ex2;

public class ContaCorrente extends ContaBancaria {
	
	
	

	public ContaCorrente(String numeroConta, double saldo, double limte) {
		super(numeroConta, saldo);
		// TODO Auto-generated constructor stub
	}

	public void sacar(double valor,double limite) {
		
		if(valor <= (getSaldo()) + limite){
			setSaldo(getSaldo()-valor);
			System.out.println("Saque de "+ valor + "realizdado com sucesso na Conta "+getNumeroConta());
			
		}else {
			System.out.println("Saque inválido");
		}
		
	}

}
