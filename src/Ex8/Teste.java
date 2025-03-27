package Ex8;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		
		Cachorro ca1 = new Cachorro();
		Gato ga1 = new Gato();
		
		ArrayList<Animal> animais = new ArrayList<>();
		
		animais.add(ca1);
		animais.add(ga1);
		
		for(Animal i: animais) {
			
			if(i instanceof Cachorro) {
				
			}
		}
		

	}

}
