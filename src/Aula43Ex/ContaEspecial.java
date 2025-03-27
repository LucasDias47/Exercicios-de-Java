package Aula43Ex;

import java.util.Scanner;

public class ContaEspecial extends ContaBancaria {
	
	Scanner scan = new Scanner(System.in);
	
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	//valor negativo da conta
	
	@Override
	public void sacar() {
		System.out.println("Digite o valor do limite: ");
		limite = scan.nextDouble();
		setLimite(limite); 
		
		boolean saqueValido = false;
		
		while(saqueValido == false) {
			
			System.out.println("Digite o valor a ser sacado: ");
			double saque = scan.nextDouble();
			
				if (saque > getSaldo() + limite) {
					System.out.println("Saque inválido, saque ultrapassou o limite.");
					
				}else {
					saqueValido = true;
					
					setSaldo(getSaldo() - saque);
					
					System.out.println("Voce sacou "+ saque);
					
				}
			
		}
		
		
			
		}
	

			public void mostrarDados() {

				System.out.println("Nome: " +getNomeCliente());
				System.out.println("Número da conta: " +getNumConta());
				System.out.println("Saldo: " + getSaldo());
				System.out.println("Limite: "+ getLimite());
			
			}
	
	}
