package Aula52Ex5;

public class Teste {

	public static void main(String[] args) throws EmprestimoNaoPermitido {
		
		/*
		 * Tentando emprestar o livro: O Senhor dos Anéis...  
Livro emprestado com sucesso!  

Tentando emprestar a revista: Ciência Hoje...  
ERRO: Revistas não podem ser emprestadas!  

Tentando emprestar o livro: Dom Quixote...  
Livro emprestado com sucesso!  

Todos os itens foram processados.

		 */
		
		Livro livro1  = new Livro();
		livro1.setTitulo("O Senhor dos Anéis ");
		
		Revista revista1 = new Revista();
		revista1.setTitulo("Ciência Hoje ");
		
		Livro livro2 = new Livro();
		livro2.setTitulo("Dom Quixote");
		
		ItemBlibioteca[] Itens = new ItemBlibioteca[3];
		
		Itens[0]=livro1;
		Itens[1]=revista1;
		Itens[2]=livro2;
		
		
		for(ItemBlibioteca i : Itens) {
			
			if(i instanceof Livro) {
				i.emprestar();
			}
			
			else if(i instanceof Revista) {
				i.emprestar();
			}
			
		}
	}

}
