package Aula43Ex;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("*** Teste ContaSimples ***");
		
		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("cliente Conta Simples");
		contaSimples.setNumConta("11111");
		
		System.out.println(contaSimples);
		
		
		System.out.println("*** Teste ContaPoupança ***");
		
		ContaPoupanca contaPoupanca  = new ContaPoupanca();
		contaPoupanca.setNomeCliente("cliente Conta Simples");
		contaPoupanca.setNumConta("22222");
		contaPoupanca.setSaldo(2000);
		contaPoupanca.setDiaRendimento(23);
		
		if(contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado, novo saldo é de = " +contaPoupanca.getSaldo());
			
		}
		
		else {
			System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
		}
		
		System.out.println(contaPoupanca);
		
		/*
		
		ContaPoupanca Conta1 = new ContaPoupanca();
	
		Conta1.criarConta();
		
		Conta1.depositar();
		
		Conta1.sacar();
		
		Conta1.calcularNovoSaldo();
		
		Conta1.mostrarDados();
		
		
		ContaEspecial Conta2 = new ContaEspecial();
		
		Conta2.criarConta();
		
		Conta2.depositar();
		
		Conta2.sacar();
		
		Conta2.mostrarDados();
		
		*/
		
		
		
		
	
		

	}

}
