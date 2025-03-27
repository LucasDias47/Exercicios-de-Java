package Aula50Ex1;

import java.util.Random;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scan  = new Scanner(System.in);
		
		int numAl = random.nextInt(10) + 1;
		
		try {
		
		System.out.println("Tente adivinhar o número (entre 1 e 10): ");
		int r = scan.nextInt();
		
		if(numAl==r) {
			System.out.println("Parabéns! Você acertou! ");
			
		}else {
			System.out.println("Número incorreto. O número era " + numAl +". ");
		}
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Programa finalizado.");
		
	}

}
