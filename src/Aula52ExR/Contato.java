package Aula52ExR;

public class Contato {
	
	private static int contador;
	
	private int id;
	private String nome;
	private String telefone;
	private String email;
	
	
	
	public Contato() {
		contador++;
		id = contador;
	}
	
	
	public static int getContador() {
		return contador;
	}
	public static void setContador(int contador) {
		Contato.contador = contador;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
