package Aula47Ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [] num ={13,5,30,25,8};
		
		try {
		
		System.out.println("Digite um índice do array (0 a 4): ");
		int ind = scan.nextInt();
		
		
		System.out.println("O valor no índice " + ind + " é: " + num[ind]);
	
		}
		
		catch(ArrayIndexOutOfBoundsException exception ) {
			System.out.println("Erro: Índice fora dos limites do array. ");
		}
		
		catch(InputMismatchException exception) {
			System.out.println("Erro: Entrada inválida. Digite apenas números inteiros. ");
		}
		
		System.out.println("Operação finalizada");
		/*
		 * ArrayIndexOutOfBoundsException
		 * 
		 * InputMismatchException
		 */

	}

}
