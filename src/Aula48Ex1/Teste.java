package Aula48Ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try {
		
			System.out.println("Digite o primeiro número: ");
			int num1 = scan.nextInt();
			
			System.out.println("Digite o segundo número: ");
			int num2 = scan.nextInt();
			
			System.out.println("Escolha a operação: (+, -, *, /,)");
			String opc = scan.next();
			
			int calc = 0;
			
			if (opc.equals ("+")) {
				calc = num1+num2;
			
			}else if(opc.equals("-")){
				calc = num1-num2;
			
			}else if(opc.equals("*")) {
				calc = num1*num2;
			
			}else if(opc.equals("/")) {
				calc = num1/num2;
			}
			
			System.out.println("Resultado da operação : " + calc);
		
		}catch(ArithmeticException exception) {
			System.out.println("Erro: Divisão por zero não é permitida. ");
		
		}catch(InputMismatchException exception) {
			System.out.println("Erro: Entrada inválida. Digite apenas números inteiros.");
		}
		
		finally {
		System.out.println("Operação finalizada");
		}
		
		
	}

}
