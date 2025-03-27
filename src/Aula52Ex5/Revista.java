package Aula52Ex5;

public class Revista extends ItemBlibioteca{

	@Override
	
	void emprestar() throws EmprestimoNaoPermitido {
		
		setDisponivel(true);
		System.out.println("Tentando emprestar a revista: "+ getTitulo()+"...");
		
		System.out.println("ERRO: Revistas não podem ser emprestadas! ");
	}

}
