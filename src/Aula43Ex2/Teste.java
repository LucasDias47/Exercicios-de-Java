package Aula43Ex2;

public class Teste {
	
	public static void main(String[] args) {
		
		/*
		Contribuinte pf1 = new Contribuinte();
		pf1.CalcularImposto();
		
		System.out.println(pf1);
		
		
		////////////////////////////
		
		
		PessoaJuridica pj1 = new PessoaJuridica();
		pj1.CalcularImposto();
		
		System.out.println(pj1);
		*/
		
		///////////////////////////
		
		//loop for
		
		
		for(int i = 0 ;i<3;i++) {
			PessoaFisica pf = new PessoaFisica();
			pf.CalcularImposto();
			System.out.println(pf);
		}
		
		
		for(int i = 0 ;i<3;i++) {
			PessoaJuridica pj = new PessoaJuridica();
			pj.CalcularImposto();
			System.out.println(pj);
		}
		
		
		
		
		
	}

}
