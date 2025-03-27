package Aula54Ex1;

public class Teste {

	public static void main(String[] args) {
		
		Estacao es1 = Estacao.PRIMAVERA;
		Estacao es2 = Estacao.VERAO;
		Estacao es3 = Estacao.OUTONO;
		Estacao es4 = Estacao.INVERNO;
		
		Estacao[] es = Estacao.values();
		
		for(int i = 0; i<es.length; i++) {
			es[i].descricao();
			
		}


	}

}
