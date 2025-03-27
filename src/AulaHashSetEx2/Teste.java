package AulaHashSetEx2;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Teste {

	public static void main(String[] args) {
		
		String[] alunos1 = {"Carlos", "Ana", "Beatriz"};
		String[] alunos2 = {"Eduardo", "Daniel", "Fernanda"};
		
		List<String> listaAlunos = new ArrayList<>();
		listaAlunos.addAll(Arrays.asList(alunos1));
		listaAlunos.addAll(Arrays.asList(alunos2));
		
		Collections.sort(listaAlunos);
		
		
		
		Set<Integer>numeros= new HashSet<>();
		
		numeros.addAll(Arrays.asList(30,6,2,7,17));
		
		System.out.println(numeros);
		
		Iterator<Integer>it = numeros.iterator();
		
		while(it.hasNext()) {
			if(it.next() %3 == 0) {
				it.remove();
			}
		}
		
		
		
		System.out.println("HashSet após remover múltiplos de 3: "+ numeros);

		Animal an1 = new Cachorro();
		//Cachorro an1 = (Cachorro) new Animal();
		
		System.out.println("Upcasting realizado com sucesso!");
		
				
		if(an1 instanceof Cachorro) {
			Cachorro ca1 = (Cachorro)an1;

			System.out.println("Downcasting bem-sucedido! O objeto é um Cachorro.");
		}
		
		System.out.println("Lista de alunos ordenada: ");
		for (String nome : listaAlunos) {
			System.out.print(nome + " ");
		}
	}

}
