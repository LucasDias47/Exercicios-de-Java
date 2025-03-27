package AulaArrayListEx3;

import java.util.ArrayList;

public class ProcessadorDeNomes {

	public static Integer contarCaracteres(ArrayList<String>nomes) {
		
		Integer totalCaracteres = 0;
		
		for (String nome : nomes) {
			totalCaracteres += nome.length();
		}
		
		return totalCaracteres;
	}
}
