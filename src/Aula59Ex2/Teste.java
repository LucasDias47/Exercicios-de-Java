package Aula59Ex2;

import static java.lang.Math.random;
import static java.lang.Math.cos;
import static java.lang.Math.toRadians;
import static java.lang.Math.max;


public class Teste {

	public static void main(String[] args) {
		
		int al = (int) (random()*10)+1; 
	
		System.out.println("Número aleatório entre 1 e 10: "+al);
		System.out.printf("Cosseno de 60 graus: %.2f%n",cos(toRadians(60)));
		System.out.println("Maior número entre 25 e 17:" +max(25,17));
	}


}
