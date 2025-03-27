package Aula52Ex4;
import java.util.Scanner;

public class Conta {
	
	private String titular;
	private double saldo;
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	void sacar() throws SaldoInsuficiente  {
		
		Scanner scan = new Scanner(System.in);
		
		try {
		
		boolean saqueValido = true;
		
		System.out.println("Digite o valor do saque: ");
		double saque = scan.nextDouble();
			if (saque<=saldo) {
				setSaldo(getSaldo()-saque);
				System.out.println("Saque realizado com sucesso! Saldo atual: " + getSaldo());
			
			}else {
				saqueValido = false;
				throw new SaldoInsuficiente(saldo, saque);
			}
			
		}catch(SaldoInsuficiente e) {
			e.printStackTrace();
		}
		
		
	}

}
