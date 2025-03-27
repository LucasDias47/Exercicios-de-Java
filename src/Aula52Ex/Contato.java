package Aula52Ex;
import java.util.Scanner;

public class Contato {
	
	private static int contador = 0;
	
	private int id;
	private String nome;
	private String telefone;
	private String email;
	
	public Contato() {
		contador++;
		id = contador;
	}
	
	
	
	
	
	public int getId() {
		return id;
	}



	


	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
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

	
	
	
	@Override
	public String toString() {
		String s = "[";
		s += "\n Id: " + id;
		s += "\n Nome: " + nome;
		s += "\n Telefone: " + telefone;
		s += "\n Email: " + email;
		return s;
	}
	


}
