package Aula63Ex1;

public class Teste {

	public static void main(String[] args) {
		
		
		 Desenvolvedor d1 = new Desenvolvedor("Bob",23, 2500, "Desenvolvedor", Departamento.TI);
		 Desenvolvedor d2 = new Desenvolvedor("Frank", 37, 5000, "Desenvolvedor", Departamento.TI);
		 Gerente g1 = new Gerente("Alice", 30, 4500, "Gerente", Departamento.FINANCEIRO);
		 Gerente g2 = new Gerente("Bobson", 34, -4440, "Gerente", Departamento.FINANCEIRO);
		 
		 Funcionario[] func = new Funcionario[4];
		 func[0]= d1;
		 func[1]= d2;
		 func[2]=g1;
		 func[3]=g2;
		 
		 
		 try {
			 for(Funcionario f : func) {
				 System.out.println(f.toString());
			 
				 if(f.getSalario()<0) {
					 throw new SalarioInvalidoException("Erro: Salário inválido! Não pode ser negativo.");
				 }
			 }
		
		 }catch(SalarioInvalidoException e) {
				 System.out.println(e.getMessage());
			 }
		 
		
		 System.out.println();
		 
		 
		 for(Funcionario f2  : func ) {
			
			 if(f2 instanceof Desenvolvedor) {			 
				 Desenvolvedor Nd1 = (Desenvolvedor)f2;
				 System.out.println(((Desenvolvedor)f2).trabalhar());
			 }
			 
			 if(f2 instanceof Gerente) {
				 Gerente Ng1 = (Gerente)f2;
				 System.out.println(((Gerente)f2).trabalhar());
				 }
			}
		 	
		 System.out.println();
		 	
		 
		 	for(Funcionario f3 : func) {
		 		
		 	if(f3 instanceof Desenvolvedor) {	
		 		Desenvolvedor Nd2 = (Desenvolvedor)f3;
		 		System.out.println(((Desenvolvedor)f3).avaliar());
		 	
		 	}
		 	
		 	if(f3 instanceof Gerente) {
		 		Gerente Ng3 = (Gerente)f3;
		 		System.out.println(((Gerente)f3).avaliar());
		 		}
		 	}
		 
		 	System.out.println();
	/////////////////////////////////////////////////////	 	
		 	
///////////////////////////////////////////////////
		 	
		 	
		 	System.out.println("Salário médio: "+  salarioMedio(d1.getSalario(),d2.getSalario(),g1.getSalario()));
	}

	static double salarioMedio(double...sal) {
				
				double tot = 0;
				double s = 0;
				
				for(int i = 0; i<sal.length; i++)
					tot += sal[i];
					s = tot/sal.length;
				
				return s;
			
			}		
		
}
