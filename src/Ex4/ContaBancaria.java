package Ex4;

import java.util.LinkedList;

public class ContaBancaria {

	//private String nome;

	//private Integer saldo;

	private LinkedList<Integer> saldo = new LinkedList<>();

	public ContaBancaria() {
		saldo.add(0);
	}

	public synchronized void depositar(int valor) {

		int saldoAtual = saldo.getLast()+valor;
		saldo.add(saldoAtual);

		System.out.println("Cliente "+ Thread.currentThread().getName() +" depositou " + valor + ". Saldo atual: " + saldoAtual);
		//setSaldo(saldo+=valor);

		//saldo.add(valor);
		notifyAll();


	}

	public synchronized void sacar(int valor) {

		while(saldo.getLast() < valor) {
			System.out.println(Thread.currentThread().getName() + " tentou sacar "+ valor + ", mas não há saldo suficiente. Aguardando depósito...");
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		int saldoAtual = saldo.getLast() - valor ;
		System.out.println(Thread.currentThread().getName() + " sacou " + valor + ".Saldo restante: " + saldoAtual);
		
	}

}
