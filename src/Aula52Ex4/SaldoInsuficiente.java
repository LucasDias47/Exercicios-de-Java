package Aula52Ex4;

public class SaldoInsuficiente extends Exception{
	
	private double saldo;
	private double saque;
	
	public SaldoInsuficiente(double saldo, double saque) {
		super();
		this.saldo = saldo;
		this.saque = saque;
	}

	@Override
	public String toString() {
		return "Saldo insuficiente para saque de " + saque + " Saldo atual: "+ saldo;
	}
	
	
	
	

}
