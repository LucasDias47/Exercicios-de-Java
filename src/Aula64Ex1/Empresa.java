package Aula64Ex1;

interface Trabalho{
	void executarTarefa();
	
}

public class Empresa {

	
	public class Anoni{
		
	}
	
	public void executarTarefa() {
		 System.out.println("Tarefa em andamento...");
	}
	
	public static void main(String[] args) {
	
		Empresa em = new Empresa();
		
		
		
		Departamento dep = new Departamento(em);
		dep.mostrarDepartamento();
		
		/*	
		Anoni an = new Anoni() {
			
			@Override
			public void executarTarefa() {
				 System.out.println("Tarefa em andamento...");
			}

			
		};
	*/
	}
	
	////////////////////////////////////
	static void mostrarInformações() {
		/////////////////////////
		class Funcionario{
			
			String nomeF = "João Silva ";
			
			void mostrarFuncionario() {
			System.out.println("Funcionário: "+ nomeF );
			}
			
		}
	///////////////////////
	
	}
	///////////////////////////////////////
	
	/////////////////////////////////////////
	public class Departamento{
	
		String nome = "Tecnologia";
		
		
		public Departamento(Empresa em) {
			// TODO Auto-generated constructor stub
		}


		void mostrarDepartamento(){
			
			
			System.out.println("Departamento: "+nome);
		}
	}
	////////////////////////////////////////
}
