package Aula43Ex;

import java.util.Calendar;
import java.util.Scanner;

public class ContaPoupanca extends ContaBancaria {
	
	private double diaRendimento;

	public double getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(double diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	/*
	public void calcularNovoSaldo() {
		
		//setSaldo(getSaldo() + diaRendimento);
		//double novoSaldo = getSaldo();
		
		System.out.println("Digite o rendimento do dia em %: ");
		double porc = scan.nextDouble();
		
		diaRendimento =  (getSaldo() * porc) /100;
		
		//novoSaldo += diaRendimento;
		//double nmovoSaldo = setSaldo(novoSaldo);
		
		setSaldo(getSaldo() + diaRendimento);
		
		System.out.println("O novo saldo é "+ getSaldo());
		
	}
	*/
	
	
	@Override
	public String toString() {
		String s = "ContaPoupança[";
		s += " diaRendimento: " + diaRendimento;  
		s += super.toString();
		s += "]";
		return s;
		
	}
	
	public boolean calcularNovoSaldo(double taxaRendimento) {
		
		Calendar hoje = Calendar.getInstance();
		
		if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			//saldo += saldo * taxaRendimento;
			this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
			return true;
		}
		return false;
	}

	@Override
	public void mostrarDados() {
		

		System.out.println("Nome: " +getNomeCliente());
		System.out.println("Número da conta: " +getNumConta());
		System.out.println("Saldo: " + getSaldo());
		System.out.println("Rendimento do dia "+ getDiaRendimento());
	}

}
