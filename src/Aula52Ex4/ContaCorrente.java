package Aula52Ex4;

import java.util.Scanner;

public class ContaCorrente extends Conta{
	
	
	@Override
	void sacar() throws SaldoInsuficiente  {
		
		Scanner scan = new Scanner(System.in);
		
		try {
		
		boolean saqueValido = true;
		
		double saque = 0;
		
		double taxa = saque -((saque*5)/100);
		
		System.out.println("Digite o valor do saque: ");
		 saque = scan.nextDouble();
			if (saque<=getSaldo()) {
				System.out.println("Conta Corrente detectada. Aplicando taxa de 5%.");
				//desconta saque
				setSaldo((getSaldo()-saque)- taxa);
				System.out.println("Saque realizado com sucesso! Novo saldo: " + getSaldo());
			
			}else {
				saqueValido = false;
				throw new SaldoInsuficiente(getSaldo(), saque);
			}
			
		}catch(SaldoInsuficiente e) {
			e.printStackTrace();
		}
		
		
	}

}
