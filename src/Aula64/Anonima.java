package Aula64;

public class Anonima {
	
	public void imprimeTexto() {
		System.out.println("qualquer texto");
	}
	
	public static void main(String[] args) {
		
		Anonima anonima = new Anonima() {
			public void imprimeTexto() {
				System.out.println("qualquer texto que foi sobrescrito");
			}
		};
		
		anonima.imprimeTexto();
		
		//usando interface
		/*Texto texto = new Texto() {
			
			public void imprimeTexto() {
				System.out.println("qualquer texto - interface ");
			}
		};
		
		texto.imprimeTexto();
	*/
	}

}
