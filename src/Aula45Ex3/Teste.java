package Aula45Ex3;

public class Teste {

	public static void main(String[] args) {
		
		Animal animais[] = new Animal[5];
		
		Animal animal1 = new Cachorro();
		Animal animal2 = new Gato();
		Animal animal3 = new Cachorro();
		Animal animal4 = new Animal();
		Animal animal5 = new Gato();
		
		animais[0] = animal1;
		animais[1] = animal2;
		animais[2] = animal3;
		animais[3] = animal4;
		animais[4] = animal5;
		
		for(int i = 0; i< animais.length;i++) {
			if (animais[i] instanceof Cachorro) {
				System.out.println("Cachorro detectado");
				
			}
			else if(animais[i] instanceof Gato){
				System.out.println("Gato detectado");
			}
			else {
				System.out.println("Outro animal detectado");
			}
			animais[i].fazerSom();
			
		}

	}

}
