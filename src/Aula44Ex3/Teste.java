package Aula44Ex3;

public class Teste {

	public static void main(String[] args) {
		//trabalhar estudar treinar
		
		Pessoa pessoas[] = new Pessoa[3];
		
		
		for(int i = 0; i<3;i++) {
			pessoas[i] = new Pessoa();
			pessoas[i].trabalhar();
			pessoas[i].estudar();
			pessoas[i].treinar();
		
		}

	}

}
