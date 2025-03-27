package Aula49Ex1;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		
		int falt = 100 - idade;
		
		System.out.println("Faltam "+ falt +" anos para você completar 100 anos.  ");
		
		System.out.println("Programa finalizado.");

	}

}
