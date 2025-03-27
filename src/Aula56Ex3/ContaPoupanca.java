package Aula56Ex3;

public class ContaPoupanca extends ContaBancaria implements Investimento{

	@Override
	public void renderJuros() {
		double juros = (5*getSaldo())/100;
		//double nSaldo = setSaldo(getSaldo()+juros);
		System.out.println("Aplicando juros na Conta Poupança de "+ getTitular());
		System.out.println("Novo saldo da conta Poupança "+ setSaldo(getSaldo()+juros));
		
	}

}
