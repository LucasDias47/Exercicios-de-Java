package EstruturadeDados;

//import java.util.List;
import java.util.LinkedList;

public class TestLinkedList {
	

	public static void main(String[] args) {
		
		
		
		//LIST
		
		
		LinkedList<String> frutas =  new LinkedList<>();//é mais lento,
												/*gasta menos memoria
												 * pode ter dados duplicados
												 */
		
		frutas.add("Maçã");
		frutas.add("Banana");
		frutas.add("Laranja");
		frutas.add("Laranja");
		
		
		System.out.println(frutas);
		
		String fruta = frutas.get(2);
		System.out.println(fruta);
		
		frutas.add(1,"Morango");
		
		System.out.println(frutas);
		
		
		
	}

}
