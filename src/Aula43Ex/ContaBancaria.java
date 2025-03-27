package Aula43Ex;

import java.util.Scanner;

public class ContaBancaria {
	
	Scanner scan = new Scanner(System.in);
	
	private String NomeCliente;
	private String NumConta;
	private double saldo;
	
	public String getNomeCliente() {
		return NomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		NomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return NumConta;
	}
	public void setNumConta(String numConta) {
		NumConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public double setSaldo(double Saldo) {
		return this.saldo = Saldo;
	}
	
	//sacar
	
	//depositar
	
	public void criarConta() {
		

		System.out.println("Digite o nome do cliente: ");
		String nome = scan.next();
		
		setNomeCliente(nome);
		
		System.out.println("Digite o numero da conta: ");
		String numCon = scan.next();
		setNumConta(numCon);
		
		System.out.println("Deposite um valor para finalizar a criação da conta.");
		
	}
	
	
	
	@Override
	public String toString() {
		String s = "ContaBancaria[";
		s += " NomeCliente: " + NomeCliente;  
		s += " NumConta: " + NumConta;
		s += " saldo; " + saldo;
		s += "]";
		return s;
		
	}
	
	
	
	/*
	 public boolean sacar(double valor){
	 	if ((saldo-valor)>=0){
	 	
	 	return true;
	 	}
	 }
	 */
	
	public void sacar() {
		
		boolean saqueValido = false;
		
		while(saqueValido == false) {
		
			System.out.println("Digite o valor a ser sacado:");
			double saque = scan.nextDouble();
			
			if (saque > saldo) {
				System.out.println("Saque inválido, saque não pode ser maior que o saldo.");
			}else {
			saqueValido = true;
			
			setSaldo(saldo - saque);
			
			System.out.println("Você sacou "+ saque);
			}
		
		}
	}
	
	public void depositar() {
		
		System.out.println("Digite o valor a ser depositado:");
		double deposito = scan.nextDouble();
		
		saldo += deposito;
		
		System.out.println("Você depositou "+ deposito);
	
	}
	
	public void mostrarDados() {
		
		System.out.println("Nome: " +getNomeCliente());
		System.out.println("Número da conta: " +getNumConta());
		System.out.println("Saldo: " + getSaldo());
		
	}

}
