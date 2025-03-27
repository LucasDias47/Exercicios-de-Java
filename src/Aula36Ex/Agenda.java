package Aula36Ex;

public class Agenda {
	
	private String nome;
	private Contato[] contatos;
	
	public Agenda() {
		
	}
	
	public Agenda(String nome) {
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private Contato[] getContatos() {
		return contatos;
	}

	void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	
	public String obterInfo() {
		String info = "Nome = " + nome + "\n";
		
		if (contatos !=null) {
			for (Contato c : contatos) {
				info += c.obterInfo() + "\n";
			}
		}
		
		return info;
		
	}
	
	

}
