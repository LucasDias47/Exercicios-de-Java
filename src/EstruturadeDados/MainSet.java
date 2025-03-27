package EstruturadeDados;

import java.util.HashSet;
import java.util.Set;

public class MainSet {

	public static void main(String[] args) {
		
		//nao permite elementos duplicados(classe precisa determinar parametro unico(equals)), nao garante ordem dos elementos
		//nao retorna indice
		
		Set<Animal> animais = new HashSet<>();
		animais.add(new Animal(1,"Cachorro"));
		animais.add(new Animal(2,"Gato"));
		animais.add(new Animal(3,"Cavalo"));
		animais.add(new Animal(4,"Coelho"));
		animais.add(new Animal(1,"Ovelha"));
		
		System.out.println(animais);
		
		System.out.println(animais.contains(new Animal(1,"Cachorro")));
		
		Animal animalEncontrado = null;
		
		for(Animal animal : animais) {
			if (animal.getNome().equals("Cachorro")) {
				animalEncontrado = animal;
			}
		}
		
		System.out.println(animalEncontrado);
		

	}

}
