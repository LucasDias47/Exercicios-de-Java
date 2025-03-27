package EstruturadeDados;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkedHashSet {  // Nome alterado para evitar conflito

    public static void main(String[] args) {
        
        // Não permite elementos duplicados (classe precisa definir equals e hashCode)
        // ordem nao importa
        // Não permite acesso por índice
        
        Set<Animal> animais = new LinkedHashSet<>();
        animais.add(new Animal(1, "Cachorro"));
        animais.add(new Animal(2, "Gato"));
        animais.add(new Animal(3, "Cavalo"));
        animais.add(new Animal(4, "Coelho"));
        animais.add(new Animal(1, "Ovelha")); // Mesmo ID do Cachorro (deve ser tratado no equals)

        System.out.println(animais);
        
        System.out.println(animais.contains(new Animal(1, "Cachorro"))); // Retorna false se equals não estiver implementado corretamente
        
        Animal animalEncontrado = null;
        
        for (Animal animal : animais) {
            if (animal.getNome().equals("Cachorro")) {
                animalEncontrado = animal;
            }
        }
        
        System.out.println(animalEncontrado);
    }
}
