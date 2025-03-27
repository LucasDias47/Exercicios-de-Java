package Aula45Ex1;

public class Teste {

	public static void main(String[] args) {
		
		/*
		 * No método main, faça o seguinte:

Crie um objeto da classe Cachorro e faça upcasting para Animal.
Verifique se o objeto é uma instância de Cachorro usando instanceof.
Realize um downcasting para transformar esse objeto de volta em Cachorro.
Chame um método específico da classe Cachorro.

Saída esperada no console:
nginx
Copiar
Editar
Upcasting realizado.
É um cachorro? true
Downcasting realizado.
Au Au! Sou um cachorro.
		 * 
		 * 
		 * Cachorro meuCachorro = (Cachorro) meuAnimal; // Downcasting
		 */
		
		//Cachorro cachorro1 = new Cachorro();
		//Animal animal1Cachorro = new Animal();
		
		/*
		 * Animal cachorro1 =(Animal)new Cachorro();
		 * 
		 * 
		 * 
		 */
		/*
		boolean eCachorro = false;
		
		System.out.println("Upcasting realizado");
		
		
		System.out.println("É um cachorro? ");
		if (animal1Cachorro  instanceof Cachorro) {
			 eCachorro = true;
			System.out.println(eCachorro);
		}
		
		//Animal cachorro1 = 
		
		Cachorro cachorro1 =  (Cachorro)animal1Cachorro;
		
		System.out.println("Downcasting realizado");
		
		if (cachorro1 instanceof Cachorro) {
		 eCachorro = true;
			
		}else {
			eCachorro = false;
		}
		
		System.out.println(eCachorro);
		*/
	
		// Upcasting: Cachorro é tratado como um Animal
        Animal meuAnimal = new Cachorro();
        System.out.println("Upcasting realizado.");

        // Verificando se o objeto é uma instância de Cachorro
        if (meuAnimal instanceof Cachorro) {
            System.out.println("É um cachorro? " + true);

            // Downcasting: Convertendo de Animal para Cachorro
            Cachorro meuCachorro = (Cachorro) meuAnimal;
            System.out.println("Downcasting realizado.");

            // Chamando método específico de Cachorro
            meuCachorro.emitirSom();
        } else {
            System.out.println("Não é um cachorro.");
        }
		
		}
	
	}

