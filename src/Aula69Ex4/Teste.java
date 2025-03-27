package Aula69Ex4;

import Aula63Ex1.Desenvolvedor;

public class Teste {

	public static void main(String[] args) {

		ContaCorrente conta1 = new ContaCorrente("1001",0);
		conta1.setNumConta("1001");

		ContaPoupanca conta2 = new ContaPoupanca("1002",0);
		conta2.setNumConta("1002");

		conta1.depositar(500);
		conta2.depositar(300);


		Conta [] contas = new Conta[2];

		contas[0]=conta1;
		contas[1]=conta2;

		System.out.println("Saldo atual da conta "+conta1.getNumConta()+"(Corrente): "+conta1.getSaldo());
		System.out.println("Saldo atual da conta "+conta2.getNumConta()+"(Poupança): "+conta2.getSaldo());
		//conta1.sacar(550);

		for(Conta c : contas) {

			if(c instanceof ContaCorrente) {
				ContaCorrente Nc1 = (ContaCorrente)c;

				try {
					((ContaCorrente)c).sacar(550);
				} catch (SaldoinsuficienteException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}

			}

			else if(c instanceof ContaPoupanca) {
				ContaPoupanca Np1 = (ContaPoupanca)c;
				try {
					((ContaPoupanca)c).sacar(250);
				} catch (SaldoinsuficienteException e) {
					// TODO Auto-generated catch block
					
					System.out.println(e.getMessage());
				}
			}


			/*
			 * if(f2 instanceof Desenvolvedor) {			 
				 Desenvolvedor Nd1 = (Desenvolvedor)f2;
				 System.out.println(((Desenvolvedor)f2).trabalhar());
			 }

			 */
		}
	
		conta1.setTipo(TipoConta.CORRENTE);
		conta2.setTipo(TipoConta.POUPANCA);
		
		
		 System.out.println("Tipo de conta "+ conta1.getNumConta() +": "+ TipoConta.CORRENTE.descricao(null, null));
		 System.out.println("Tipo de conta "+ conta2.getNumConta() +": "+ TipoConta.POUPANCA.descricao(null, null));
		
		
		 System.out.println("Média dos saldos: "+calcularMediaSaldos(conta1.getSaldo(),conta2.getSaldo()));
	
		 Processo pro1 = new Processo(1);
		 Processo pro2 = new Processo(2);
		 
		 Thread p1 = new Thread(pro1);
		 Thread p2 = new Thread(pro2);
		 
		 p1.start();
		 
		 try {
			p1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.print("e ");
		 
		 p2.start();
		 
		 try {
			p2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 System.out.print("processando depósitos...");
		 
		  try {
			p1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 try {
			p2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println();
	System.out.println("Threads finalizadas com sucesso!");
	}
	
	
	
	static double calcularMediaSaldos(double...media) {
		
		double tot = 0;
		double f = 0;
		
		for(int i = 0;i<media.length;i++) {
			
			tot+=media[i];
			f = tot/media.length;
			
		}
		
		return f;
	}

	/*

		conta1.depositar(500);
		conta2.depositar(300);



	 */
}


