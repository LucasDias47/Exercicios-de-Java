package AulaArrayListEx3;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		
		Cachorro ca1 = new Cachorro();
		Gato ga1 = new Gato();
		
		System.out.println(ca1.fazerSom());
		System.out.println(ga1.fazerSom());
		
		ca1.setNome(" Rex");
		ga1.setNome(" Garfield ");
		
		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add(ca1.getNome());
		nomes.add(ga1.getNome());
		
		Integer total = ProcessadorDeNomes.contarCaracteres(nomes);
		System.out.println("Total de caracteres nos nomes: "+ total);
		
		FilaDeAnimais fila = new FilaDeAnimais();
		
		Thread consumidor = new Thread(()-> {
			
			for(int i = 0; i<3 ; i++) {
				
				try {
					fila.removerAnimal();
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		});
		
		Thread produtor = new Thread(()->{
			
			for(int i = 0;i<nomes.size();i++) {
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				fila.adicionarAnimal(nomes.get(i));
			}
			
		});
		
		consumidor.start();
		produtor.start();

	}

}
