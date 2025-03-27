package Aula52ExR;
import java.util.Scanner;

public class Agenda {
	
	Scanner scan = new Scanner(System.in);
	
	private Contato[] contatos;
	
	
	//private Agenda[]Contatos = new Agenda[5];

	public Agenda() {
		contatos = new Contato[5];
	}
	
	public void adicionarContato() throws AgendaCheiaException {
	//boolean agendaCheia = false;
	
	
	if(contatos.length<5) {
	System.out.println("Contato adicionado");	
	
	}
	
	/*
	if(contatos.length==5) {
		throw new AgendaCheiaException();
	}
	*/
	
	
	//for (int i =  0 ;i<Contatos.length;i++)
		
	
		
	}
	
	
	

}
