package AulaLinkedListEx1;

import java.util.LinkedList;

public class Teste {

	public static void main(String[] args) {
		
		LinkedList<Integer> numeros = new LinkedList<>();
		
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		numeros.add(40);
		numeros.add(50);
		
		numeros.remove(0);
		numeros.removeLast();
		numeros.add(1,25);
	
		
		System.out.println(numeros);

	}

}
