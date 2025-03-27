package AulaArrayListEx1;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
		List<String> frutas = new ArrayList();
		
		frutas.add("Maçã");
		frutas.add("Banana");
		frutas.add("Laranja");
		frutas.add("Uva");
		
		frutas.remove(1);
		frutas.add(1,"Manga");
		System.out.println(frutas);

	}

}
