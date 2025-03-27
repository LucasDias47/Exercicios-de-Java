package EstruturadeDados;

import java.util.ArrayList;

import java.util.List;

public class MainList {

	public static void main(String[] args) {
		
		
		
		//LIST
		
		
		List<String> frutas = new ArrayList<>();//aumenta capacidade (10 espaços)conforme adiciona items
												/*cria novo array com capacidade maior e apaga o antigo
												 * 
												 */
		
		frutas.add("Maçã");
		frutas.add("Banana");
		frutas.add("Laranja");
		//frutas.add("Laranja");
		
		System.out.println(frutas);
		
		String fruta = frutas.get(2);
		System.out.println(fruta);
		
		frutas.add(1,"Morango");
		
		System.out.println(frutas);
		
		
		
	}

}
