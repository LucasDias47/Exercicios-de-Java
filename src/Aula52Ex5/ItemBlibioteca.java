package Aula52Ex5;

public class ItemBlibioteca {
	
	private String titulo;
	private boolean disponivel;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	void emprestar() throws EmprestimoNaoPermitido {
		
	}
	

}
