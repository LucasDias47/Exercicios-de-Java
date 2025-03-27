package Aula47Ex1;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int num1 = scan.nextInt();
		
	    System.out.println("Digite o segundo número: ");
	    int num2 = scan.nextInt();
	    
	    int div = 0;
	    
	    
	    
	    try {
	    	 div = num1 / num2;
	    	 System.out.println("Resultado da divisão: " + div);
	    }
	    
	    catch(ArithmeticException exception){
	    	System.out.println("Erro: Não é possível dividir por zero! ");
	    	
	    }
	      
	    
	    System.out.println("Programa finalizado.");
	    

	}

}
