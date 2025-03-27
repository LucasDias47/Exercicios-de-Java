package Aula50Ex3;

import java.util.Scanner; 

public class Teste {

	public static void main(String[] args) {
		
		try {
			int calc = divNumero();
		
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		System.out.println("Programa finalizado.");

	}
	
	public static int divNumero() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int num2 = scan.nextInt();
		
		int div = num1 / num2;
		
		System.out.println("Resultado da divisão: "+ div);
		return div;
		
		
	}
	
	
	

}
