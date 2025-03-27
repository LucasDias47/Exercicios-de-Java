package Aula57Ex2;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo número:");
		int num2 = scan.nextInt();
		
		
		
		num1 = Integer.valueOf(num1);
		num2 = Integer.valueOf(num2);
		//div = Integer.valueOf(div);
		//boolean comp = numWrapper.equals(outNum);
		
		Integer numWrapper1 = Integer.valueOf(num1);
		Integer numWrapper2 = Integer.valueOf(num2);
		
		int soma = numWrapper1 + numWrapper2;
		int sub = numWrapper1 - numWrapper2;
		int mult = numWrapper1 * numWrapper2;
		int div = numWrapper1 / numWrapper2;
		
		//String resultadoStr = soma.toString();
		
		boolean comp = numWrapper1.equals(numWrapper2);
		
				System.out.println("Soma: "+soma);
		System.out.println("Subtração: "+ sub);
		System.out.println("Multiplicação: "+ mult);
		System.out.println("Divisão: "+ div);
		System.out.println("Resultado como String: "+soma);
		System.out.println("Os números são iguais? "+ comp);
		
		
		
	}

}
