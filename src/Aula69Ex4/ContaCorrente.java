package Aula69Ex4;

public class ContaCorrente extends Conta{

	public ContaCorrente(String string, int i) {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void sacar(double saque) throws SaldoinsuficienteException {

		double taxa = (saque*2)/100;

		System.out.println("Tentativa de saque de " + saque +" na conta "+ getNumConta() +"...");

		if(saque <= getSaldo()) {
			setSaldo(getSaldo()-saque-taxa);
			System.out.println("Saque realizado com sucesso! Novo saldo: "+ getSaldo());
		}

		else{
			throw new SaldoinsuficienteException("ERRO: Saldo insuficiente para saque!");

		}

	}


	
}
	

