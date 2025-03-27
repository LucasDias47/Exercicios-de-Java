package Aula47Ex3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		/*
		double numero = 10.5;  // Declarando um número decimal do tipo double
		float outroNumero = 5.75f; // Float precisa do "f" no final
		
		float valorFloat = 10.5f;
		double valorDouble = valorFloat; // Conversão automática
		System.out.println(valorDouble); // Saída: 10.5
		*/
		
		Scanner scan = new Scanner(System.in);
		
		try {
		
		System.out.println("Digite um número decimal: ");
		float num = scan.nextFloat();
		
		double numDouble = num;
		
		double Q = numDouble * numDouble;
		
		System.out.println("O quadrado de "+ numDouble  + " é " + Q);
	
		}
		
		catch( InputMismatchException exception) {
			System.out.println("Erro: Entrada inválida. Digite apenas números decimais. ");
		}
		
		
		System.out.println("Operação finalizada. ");
		 
		/*
		 * InputMismatchException
		 * 
		 */
	}

}
