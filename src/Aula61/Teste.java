package Aula61;

public class Teste {

	private static void main(String[]args) {
		

	Contato contato = new Contato("Contato 1", "1234-4567", "contato1@email.com");
	int valor = 10;
	
	testePassagemValorReferencia(valor, contato);
	
	System.out.println(contato);
	System.out.println(valor);
	
	/*
	
	
		int novoValor = valor + 10;
		valor = novoValor;
		contato = new Contato("Contato 2", "2345-6789", "contato2@email.com");
	
	
	testePassagemValorReferencia(valor, contato);
	
	System.out.println(contato);
	System.out.println(valor);
	*/
}
