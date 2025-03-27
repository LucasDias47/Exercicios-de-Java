package Aula52Ex;
import java.util.Scanner;

public class Agenda {
	
	private Contato[] contatos;
	
	public Agenda() {
		contatos = new Contato[5];
	}
	
	public void adicionarContato(Contato c) throws AgendaCheiaException {
		
		boolean cheia = true;
		for(int i=0; i<contatos.length; i++) {
			if (contatos[i] != null) {
				contatos[i]=c;
				cheia = false;
			}
		}
		
		if (cheia) {
			//lançar exception aqui
			throw new AgendaCheiaException();
		}
		
	}
	
	
	public int consultaContatoPorNome(String nome) throws ContatoNaoExisteException {
			
			for (int i=0; i<contatos.length; i++) {
				if (contatos[i] !=null) {
					if(contatos[i].getNome().equalsIgnoreCase(nome));
						return i;
				}
			}
		
	
		//lançar exception contato nao existe;
		throw new ContatoNaoExisteException (nome);
		
		
		}
	
	



		
		
		

	@Override
	public String toString() {
		String s="";
		for (Contato c: contatos) {
			s += c.toString() + "\n";
		}
		
		return s;
	}
	
	/*
	
	Scanner scan = new Scanner(System.in);
	
	void adicionarContato() {
		Contato contato = new Contato(0);
		System.out.println("Digite o nome do contato: ");
		contato.setNome(scan.next());
		System.out.println("Digite o telefone do contato: ");
		contato.setTelefone(scan.next());
	}
	
	
	
	void consultarContato() {
		//System.out.println(contato.getNome());
	}
	
	*/
	
	

}
