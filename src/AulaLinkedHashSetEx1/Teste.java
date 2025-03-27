package AulaLinkedHashSetEx1;

import java.util.LinkedHashSet;

public class Teste {

	public static void main(String[] args) {
		
		String n= "";
		
		LinkedHashSet<String> arquivos = new LinkedHashSet<>();
		LinkedHashSet<String> arqPr = new LinkedHashSet<>();
		
		for(int i = 1;i<4;i++) {
		
		MinhaThread thi = new MinhaThread(n+i, i, arquivos);
		
		thi.start();
		
		try {
			thi.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (thi.isAlive()==false) {
			arqPr.add("arquivo"+n+i+".txt");
		//System.out.println(thi.currentThread().getName());
		}
		
		}
		
		System.out.println(arqPr);
	}

}
