package Ex2;

public class ContaPoupança extends ContaBancaria {

	public ContaPoupança(String numeroConta, double saldo) {
		super(numeroConta, saldo);
		// TODO Auto-generated constructor stub
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
