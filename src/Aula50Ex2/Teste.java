package Aula50Ex2;

import java.util.Random;
import java.util.Scanner;

public class Teste {

	public static int leNumero() throws Exception{
			Scanner scan  = new Scanner(System.in);
			int num = scan.nextInt();
			return num;
			
		}
		
	
	
	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scan  = new Scanner(System.in);
		
		int numAl = random.nextInt(10) + 1;
		
		
		
		System.out.println("Tente adivinhar o número (entre 1 e 10): ");
		
		try {
		
		int r = leNumero();	
		//int r = scan.nextInt();
		
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


