package Aula52Ex3;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) throws NomeCurto {
		
		teste();

	}
	
	public static void teste() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = scan.next();
		
		boolean nomeValido = true;
		
		//String regex = "^(?=.*[A-Z])(?=.*\\d).{8,}$";
		
		String regex ="^.{3,}$";
		
		//if(senhaValida == senha.matches(regex)) 
			
		try {
			if (nomeValido == nome.matches(regex)) {
				System.out.println("Nome cadastrado com sucesso: "+ nome);
			
			}else {
				nomeValido = false;
				throw new NomeCurto(nome);
			}
			
		}catch(NomeCurto e){
			e.printStackTrace();
		}
	}

}
