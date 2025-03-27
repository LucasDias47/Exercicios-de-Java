package Aula43Ex3;

public class Teste {

	public static void main(String[] args) {
		
		
		Animais animal1 = new Animais();
		
		Peixe peixe1 = new Peixe();
		
		Mamifero mamifero1 = new Mamifero();
		
		animal1.coletarInfo();
		peixe1.coletarInfo();
		mamifero1.coletarInfo();
		
		System.out.println("Zoo:");
		System.out.println("-----------------------");
		System.out.println(animal1);
		System.out.println(peixe1);
		System.out.println(mamifero1);
		
		/*
		animal1.mostrarInfo();
		peixe1.mostrarInfo();
		mamifero1.mostrarInfo();
		*/

	}

}
