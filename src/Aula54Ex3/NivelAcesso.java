package Aula54Ex3;

public enum NivelAcesso {
	
	ADMINISTRADOR(1, "Acesso total ao sistema"), MODERADOR(2, "Acesso limitado a algumas funções"), USUARIO_COMUM(3, "Acesso básico ao sistema");
	
	private int codigo;
	private String permissao;
	
	public int getCodigo() {
		return codigo;
	}

	public String getPermissao() {
		return permissao;
	}

	private NivelAcesso(int codigo, String permissao) {
		this.codigo = codigo;
		this.permissao = permissao;
	}
	
	void descricao() {
		System.out.println("Código "+ getCodigo() +" "+ this.name() + " -> Permissão: " +getPermissao());
	}
	
	
	
	
	
	

}
