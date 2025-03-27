package Aula53Ex1;

public class Teste {

	public static void verificarAcesso(NivelAcesso nivel) throws AcessoNegadoException{
			if (nivel != NivelAcesso.ADMIN) {
				
				throw new AcessoNegadoException("Acesso negado, apenas ADMIN pode acessar esta área.");
			}
			 System.out.println("Acesso permitido. Bem-vindo, ADMIN!");
		}
	
	
	
	public static void main(String[] args) {
		
		try {
			verificarAcesso(NivelAcesso.ADMIN);
			verificarAcesso(NivelAcesso.USER);
			verificarAcesso(NivelAcesso.GUEST);
		
		}catch(AcessoNegadoException e) {
			System.out.println(e.getMessage());
		}

	}
	
	

	
		
		
}
	


