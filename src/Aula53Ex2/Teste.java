package Aula53Ex2;

public class Teste {

	public static void main(String[] args) throws SaldoInsuficienteException, SaqueAcimaDe1000Exception {
		
		try {
			
			
			ContaBancaria conta1 = new ContaBancaria();
			conta1.setTipo(TipoConta.CORRENTE);
			conta1.sacar();
			
			
		}catch(SaldoInsuficienteException | SaqueAcimaDe1000Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
		
		ContaBancaria conta2 = new ContaBancaria();
			conta2.setTipo(TipoConta.POUPANCA);
			conta2.sacar();
		
		}catch(SaldoInsuficienteException | SaqueAcimaDe1000Exception e) {
			System.out.println(e.getMessage());
		}	
		
		try {	
			ContaBancaria conta3 = new ContaBancaria();
			conta3.setTipo(TipoConta.SALARIO);
			conta3.sacar();
		
		}catch(SaldoInsuficienteException | SaqueAcimaDe1000Exception e) {
			System.out.println(e.getMessage());
		}	

	}

}
