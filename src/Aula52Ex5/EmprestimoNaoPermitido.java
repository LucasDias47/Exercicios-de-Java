package Aula52Ex5;

public class EmprestimoNaoPermitido extends Exception {
	
	private String titulo;
	private boolean disponivel;
	
	public EmprestimoNaoPermitido(String titulo, boolean disponivel) {
		super();
		this.titulo = titulo;
		this.disponivel = disponivel;
	}

	@Override
	public String toString() {
		return "ERRO: Revistas não podem ser emprestadas! ";
	}
	
	
	
	
	

}
