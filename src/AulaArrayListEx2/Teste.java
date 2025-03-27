package AulaArrayListEx2;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		numeros.add(40);
		numeros.add(50);
		
		numeros.remove(2);
		numeros.add(2,25);
		numeros.set(3, 45);
		
		System.out.println(numeros);
		
		
		

	}

}
