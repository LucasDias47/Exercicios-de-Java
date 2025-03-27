package Aula52;

public class UsandoMinhaException {
	
	public static void main (String args []) {
		//forma 1
		
		/*
		int[] numeros = {4, 8, 5, 16, 32, 21, 64, 128};
		int[] demon = {2,0,4,8,0, 2, 4};
		
		for (int i=0; i<numeros.length; i++) {
			
			try {
				if(numeros[i]%2 !=0) {
					//lançar minha excessao
					throw new DivisaoNaoExata(numeros[i],demon[i]);
				
				}
				
				System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/demon[i]));
			
			
			}//exceptions da mesma familia pode ficar juntos
			catch(ArithmeticException | ArrayIndexOutOfBoundsException e1) {
				System.out.println("Aconteceu um erro");
			}
			catch(Exception e) {
				System.out.println("Aconteceu um erro");
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			
		}
		
	}
	*/
		//forma 2
		
		
		try {
			teste();
		
		}catch (DivisaoNaoExata e) {
			e.printStackTrace();
			}
		}
		
		
		public static void teste() throws DivisaoNaoExata {
			
			int[] numeros = {4, 8, 5, 16, 32, 21, 64, 128};
			int[] demon = {2,0,4,8,0, 2, 4};
			
			for (int i=0; i<numeros.length; i++) {
				
				try {
					if(numeros[i]%2 !=0) {
						//lançar minha excessao
						throw new DivisaoNaoExata(numeros[i],demon[i]);
					
					}
					
					System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/demon[i]));
				
				
				}//exceptions da mesma familia pode ficar juntos
				catch(ArithmeticException | ArrayIndexOutOfBoundsException e1) {
					System.out.println("Aconteceu um erro");
				}
				catch(Exception e) {
					System.out.println("Aconteceu um erro");
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				
			}
			
		
		
		
	
	
	}
	
}
