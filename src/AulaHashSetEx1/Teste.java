package AulaHashSetEx1;

import java.util.HashSet;
import java.util.Set;

public class Teste {

	public static void main(String[] args) {
		
		Set<Integer> numeros = new HashSet<>();
		
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		numeros.add(40);
		numeros.add(50);
		
		System.out.println("Conjunto inicial: "+numeros);
		numeros.remove(30);
		System.out.println("Conjunto após remover 30: "+numeros);
		
		if (numeros.contains(20)) {
			System.out.println("O número 20 está no conjunto");
		}
		
		

	}

}
