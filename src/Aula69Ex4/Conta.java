package Aula69Ex4;

public class Conta implements Transacao, Relatorio{

	private String dono;
	private String numConta;
	private double saldo;
	private TipoConta tipo;
	
	
	
	
	
	
	public Conta( String numConta, double saldo) {
		super();
		this.dono = dono;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	

	public Conta() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double deposito) {
		
		setSaldo(getSaldo()+deposito);
		System.out.println("Depósito de "+ deposito +" realizado com sucesso na conta "+getNumConta() +".");
	}

	public void sacar(double saque) throws SaldoinsuficienteException {
		
		System.out.println("Tentativa de saque de " + saque +" na conta "+ getNumConta() +"...");
		
		if(saque <= getSaldo()) {
			setSaldo(getSaldo()-saque);
			System.out.println("Saque realizado com sucesso! Novo saldo: "+ getSaldo());
		}
		
		else{
			throw new SaldoinsuficienteException("ERRO: Saldo insuficiente para saque!");
			
		}
		
	}
	
	@Override
	public void gerarRelatorio() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executar() {
		// TODO Auto-generated method stub
		
	}



	public TipoConta getTipo() {
		return tipo;
	}



	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}

}
