package AulaLinkedHashSetEx1;

import java.util.LinkedHashSet;

public class MinhaThread extends Thread{
	
	String arq;
	int num;
	LinkedHashSet<String> arquivos;
	
	public MinhaThread(String arq, int num, LinkedHashSet<String> arquivos) {
		this.arq = arq;
		this.num = num;
		this.arquivos = arquivos;
	}

	public void run(){
		
		arquivos.add(arq);
		System.out.println("Thread-"+num+ " processando: arquvivo"+num+".txt");
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("arquvivo"+num+".txt já foi processado!");
		
	}
	
	
	
	

}
