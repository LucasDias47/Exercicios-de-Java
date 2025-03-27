package Aula56Ex3;

import Aula54Ex4.Celular;

public class Teste {

	public static void main(String[] args) throws SaldoInsuficienteException {
		
		ContaCorrente conta1 = new ContaCorrente();
		conta1.setTitular("João");
		conta1.setSaldo(1000);
		
		ContaPoupanca conta2 = new ContaPoupanca();
		conta2.setTitular("Maria");
		conta2.setSaldo(1500);
		
		ContaBancaria[]contas = new ContaBancaria[2];
		
		contas[0]=conta1;
		contas[1]=conta2;
		
		
		for(ContaBancaria c : contas) {
			
			if( c instanceof ContaCorrente) {
				/*
				 * if( i instanceof Celular) {
				//Celular nCel1 = (Celular)i;
			((Celular) i).carregarBateria();
				
				 */
				
				//ContaCorrente nCon1 = (ContaCorrente)c;
				
				System.out.println("Conta Corrente de " + c.getTitular() + " criada com saldo: R$ " + c.getSaldo());
			}
			
			if(c instanceof ContaPoupanca) {
				
				System.out.println("Conta Poupança de " + c.getTitular() + " criada com saldo: R$ " + c.getSaldo());
				ContaPoupanca nCon2 = (ContaPoupanca)c;
				((ContaPoupanca )c).renderJuros();
			}
			
			try {
			double valor = 200;
			
			System.out.println("Tentando sacar R$ "+ valor + " da conta de "+ c.getTitular());
			
			if(valor >c.getSaldo()) {
			throw new SaldoInsuficienteException("Saldo insuficiente para saque! ");
			
			}else {
				c.sacar(valor);
				System.out.println(c.getTitular() + " sacou " + valor);
				System.out.println("Saldo atual: " + c.setSaldo(c.getSaldo()-valor));
			}
		
	}catch(SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
			}
		
		}
		System.out.println();
		//System.out.println(TipoConta.CORRENTE.valueOf("Corrente"));
		TipoConta[]contasq = TipoConta.values();
		System.out.println("Tipos de contas disponíveis:");
		for(TipoConta c : contasq) {
			System.out.println(c);	
		}
		System.out.println();
		System.out.println("Conta escolhida via valueOf: "  + Enum.valueOf(TipoConta.class, "POUPANCA"));
		
		
		System.out.println(TipoConta.CORRENTE.descricao(null, null));
		System.out.println(TipoConta.POUPANCA.descricao(null, null));
		
		
		
		/*
		 * Conta Corrente: Conta para movimentação diária, sem juros.
            Conta Poupança: Conta que acumula juros mensalmente.
		 */
	
		
		
	}
	
}
