package Aula62Ex2;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(concatenaStrings("Olá"," mundo"));
		System.out.println(concatenaStrings("Java"," é"," uma"," bosta"));
		System.out.println(concatenaStrings("Eu"," estou"," cansado"," dessa"," merda"));
	}
	
	static String concatenaStrings(String...str ) {
		
		String tot = "";
		
		for (int i = 0; i< str.length; i++) {
			tot += str[i];
		}
		
		return tot;
	}

}
