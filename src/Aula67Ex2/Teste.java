package Aula67Ex2;
import java.util.Random;

public class Teste {
	
	public static void main (String args[]) {
	
	int v1 = 0;
	
	int v2 = 0;
	
	int v3 = 0;
	
	Random random = new Random();
	
	v1 = random.nextInt(500,1500);
	v2 = random.nextInt(500,1500);
	v3 = random.nextInt(500,1500);
	
	
	Corrida thread1 = new Corrida(1,v1);
	thread1.setTempo(v1);
	
	Corrida thread2 = new Corrida(2,v2);
	thread2.setTempo(v2);
	
	Corrida thread3 = new Corrida(3,v3);
	thread3.setTempo(v3);
	
	
	/*
	System.out.println("...");
	System.out.println("Corredor " + getNum() +" terminou a corrida!");
	System.out.print("Ordem de chegada: ");
	System.out.print(num+" ->");
	*/
	}
}
