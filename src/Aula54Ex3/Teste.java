package Aula54Ex3;

public class Teste {
	
	public static void main (String []args) {
		
		NivelAcesso p1 =  NivelAcesso.ADMINISTRADOR;
		NivelAcesso p2 = NivelAcesso.MODERADOR;
		NivelAcesso p3 = NivelAcesso.USUARIO_COMUM;
		
		NivelAcesso[] p = NivelAcesso.values();
		
		for(NivelAcesso pl : NivelAcesso.values()) {
			pl.descricao();
		}
		
	}

}
