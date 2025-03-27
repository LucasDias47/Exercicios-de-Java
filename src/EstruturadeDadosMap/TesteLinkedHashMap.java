package EstruturadeDadosMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class TesteLinkedHashMap {
	

	public static void main(String[]args) throws Exception{
		
		//Linkedhashmap  garante ordem
		//nao permite dados duplicados
		//se repetir chave, ele sobreescreve a antiga
		
		Map<String, Integer> pessoas = new LinkedHashMap<>();
		
		pessoas.put("Ana", 22);
		pessoas.put("Mariana", 6);
		pessoas.put("Daniel", 10);
		pessoas.put("Ana", 23);
		
		//System.out.println(pessoas);
		//System.out.println(pessoas.get("Ana"));
		
		System.out.println(pessoas);
		
		/*
		
		for(Map.Entry<String, Integer> pessoa : pessoas.entrySet()) {
			//System.out.println(pessoa);
			System.out.println(pessoa.getKey() + " === " + pessoa.getValue());
			
		}
		*/
		
	}


}
