package Aula52Ex5;

public class Livro extends ItemBlibioteca{
	
	
	
	@Override
	
	void emprestar() {
		setDisponivel(true);
		System.out.println("Tentando emprestar o livro: "+ getTitulo()+"...");
		System.out.println("Livro emprestado com sucesso! ");
		setDisponivel(false);
		//Livro emprestado com sucesso! 
	}

}
