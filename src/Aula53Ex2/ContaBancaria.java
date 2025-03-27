package Aula53Ex2;
import java.util.Scanner;

public class ContaBancaria {

	private TipoConta tipo;
	private double saldo;
	
	public TipoConta getTipo() {
		return tipo;
	}
	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	void sacar() throws SaldoInsuficienteException, SaqueAcimaDe1000Exception{
		
		Scanner scan = new Scanner(System.in);
		
		setSaldo(2000);
		double saque = 0;
		System.out.println("Digite o valor do saque: ");
		saque = scan.nextDouble();
		
		if (saque>saldo) {
			
			throw new SaldoInsuficienteException("Erro: Saldo insuficiente para realizar o saque!");
		}
		
		if  (tipo==TipoConta.SALARIO && saque >1000) {
			
			throw new SaqueAcimaDe1000Exception("Erro: Contas do tipo SALARIO não podem sacar mais que R$ 1000.0!\n");
				
		}
		
		setSaldo(getSaldo()-saque);
		System.out.println("Saque de R$ "+ saque + " realizado com sucesso! Saldo restante: R$ "+ saldo );
		
	}
}
