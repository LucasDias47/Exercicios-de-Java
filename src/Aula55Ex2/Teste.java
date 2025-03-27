package Aula55Ex2;

import Aula53.DiaSemana;

public class Teste {
	
	public static void main (String[] args) {
		
		NivelAcesso niv2 = NivelAcesso.valueOf("USUARIO");
		//DiaSemana dia1 = Enum.valueOf(DiaSemana.class, "QUARTA");
        NivelAcesso niv1 = Enum.valueOf(NivelAcesso.class,"USUARIO"); 
		
		System.out.println(NivelAcesso.ADMIN.getValue());
		System.out.println(niv2);
		
	}

}
