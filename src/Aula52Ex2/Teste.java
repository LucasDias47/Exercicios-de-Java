package Aula52Ex2;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) throws IdadeInvalida {
		
		teste();

	}
	
	public static void teste() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		boolean idadeValida = true;
		
		try {
			
			if(idade >0 && idade <=150) {
				
				System.out.println("Idade registrada com sucesso: " + idade + " anos.");
			}
			
			else{
				idadeValida = false;
				throw new IdadeInvalida(idade);
				//System.out.println("Erro: Idade inválida! A idade deve ser um número positivo e menor que 150.   ");
				
			}
			
		}catch(IdadeInvalida e) {
			e.printStackTrace();
		}
		
	}

}
