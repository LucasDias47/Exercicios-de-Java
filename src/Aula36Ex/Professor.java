package Aula36Ex;

public class Professor {
	
	private String nome;
	private String departamento;
	private String email;
	
	private String getEmail() {
		return email;
	}
	void setEmail(String email) {
		this.email = email;
	}
	private String getDepartamento() {
		return departamento;
	}
	void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	private String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	
	public String obterInfo() {
		return "Professor = " +  nome;
		
	}

}
