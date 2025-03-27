package Aula71Ex2;

public class Contador {

	private int valor = 0;
	
	public synchronized void incrementar() {
		
		valor++;
	}
	
	public synchronized void decrementar() {
		
		valor --;
	}
	
	public void exibirValor(){
		
		System.out.println("Valor atual: "+ valor);
	}
	
	public void exibirValorFinal(){
		
		System.out.println("Valor final: "+ valor);
	}
	                                       
}
