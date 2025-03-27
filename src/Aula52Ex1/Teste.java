package Aula52Ex1;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		try {
			teste();
		}catch(SenhaInvalida e) {
			e.printStackTrace();
			
		}

	}
	
	public static void teste() throws SenhaInvalida{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma senha: ");
		String senha = scan.next();
		
		/*
		 * String regex = "^(?=.*[A-Z])(?=.*\\d).{8,}$";
         boolean senhaValida = senha.matches(regex);
		 */
		
		
		String regex = "^(?=.*[A-Z])(?=.*\\d).{8,}$";
		boolean senhaValida = true;
		//boolean senhaValida = senha.matches(regex);
		
		
		try {
		
			if(senhaValida == senha.matches(regex)) {
			System.out.println("Senha cadastrada com sucesso! ");
			
		}else if (senhaValida != senha.matches(regex)) {
				senhaValida = false;
				throw new SenhaInvalida (senha);
			}
			
		}catch(SenhaInvalida e) {
			//System.out.println("Aconteceu um erro");
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
	}

}
