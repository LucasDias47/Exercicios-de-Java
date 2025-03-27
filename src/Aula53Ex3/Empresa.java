package Aula53Ex3;

public class Empresa {
	
	private static String mensagem;

	public static void main (String [] args) throws SalarioInvalidoException {
		//Departamento[] departamentos = {Departamento.TI, Departamento.RH, Departamento.FINANCEIRO};
		//Departamento [] departamentos = Departamento.values();
		
		Funcionario [] funcionarios = new Funcionario[5];  
		
		Desenvolvedor fun1 = new Desenvolvedor();
		fun1.setNome("Ana");
		fun1.setDep(Departamento.TI);
		fun1.setSalario(5000);
		
		Funcionario fun2 = new Funcionario();
		fun2.setNome("Carlos");
		fun2.setDep(Departamento.RH);
		fun2.setSalario(4500);
		
		Contador fun3 = new Contador();
		fun3.setNome("Roberto");
		fun3.setDep(Departamento.FINANCEIRO);
		fun3.setSalario(7000);
		
		Gerente fun4 = new Gerente();
		fun4.setNome("Marcos");
		fun4.setDep(Departamento.TI);
		fun4.setSalario(9000);
		
		Funcionario fun5 = new Funcionario();
		fun5.setNome("João");
		fun5.setDep(Departamento.RH);
		fun5.setSalario(300);
		
		funcionarios[0]= fun1;
		funcionarios[1]= fun2;
		funcionarios[2]= fun3;
		funcionarios[3]= fun4;
		funcionarios[4]= fun5;
		
		double min = 1000;
		
		try {
		
			for(Funcionario func : funcionarios ) {
				func.calcularBonus();
				
				if(func.getSalario()< 1000) {
					throw new SalarioInvalidoException("Lançando exceção: Salário inválido para o funcionário "+ func.getNome(), mensagem);
				}
				
				if(!(func instanceof Gerente)){
				System.out.println(func);	
				}
				
				if(func instanceof Gerente) {
					System.out.println("O gerente " +func.getNome() + " tem um bônus especial de: "+ func.getBonus());
				}	
			
			}
		}catch(SalarioInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}

}
