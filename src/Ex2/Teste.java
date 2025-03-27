package Ex2;

public class Teste {

	public static void main(String[] args) {
		
		ContaCorrente con1 = new ContaCorrente("12345", 1000, 100);
		ContaPoupança con2 = new ContaPoupança("67890", 2000);
		
		ContaBancaria [] contas = new ContaBancaria[2];
		
		contas[0]=con1;
		contas[1]=con2;
		
		for(ContaBancaria c: contas) {
			
			if(c instanceof ContaCorrente ) {
				c.sacar(500);
			}
			
			if(c instanceof ContaPoupança) {
				c.sacar(300);
				
			}
			
		}

	}

}
