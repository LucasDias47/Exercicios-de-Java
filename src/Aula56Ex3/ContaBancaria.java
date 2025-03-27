package Aula56Ex3;

import Aula54Ex4.DispositivoDesligadoException;

public class ContaBancaria implements Conta {
	
	private String titular;
	private double saldo;
	private double valor;
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public double setSaldo(double saldo) {
		return this.saldo = saldo;
	}
	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sacar(double valor) {
		valor = 2000;
		setSaldo(getSaldo()-valor);
		
	}
	@Override
	public void mostrarSaldo() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
