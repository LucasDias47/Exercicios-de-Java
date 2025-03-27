package Aula54Ex4;

public class Teste {

	public static void main(String[] args) throws DispositivoDesligadoException{
		
		
		Celular cel1 = new Celular("iPhone 13");
		Notebook pc1 = new Notebook("Dell XPS");
		Dispositivo pc2 = new Dispositivo("Dell OPT");
		
		Dispositivo [] disp = new Dispositivo[3];
		
		disp[0]= cel1;
		disp[1]= pc1;
		disp[2]= pc2;
		boolean ativo = false;
		
		try {
		for (Dispositivo i : disp) {
			i.ligar();
			ativo = true;
			
			if( i instanceof Celular) {
				//Celular nCel1 = (Celular)i;
			((Celular) i).carregarBateria();
				
				
				
			}
			
			if(i instanceof Notebook) {
				//Notebook nPc1 = (Notebook)i;
				((Notebook) i).instalarSoftware();
				
			}
			i.desligar();
			//ativo =false;
			
			//if(i instanceof N)
			
			if (ativo == false) {
				throw new DispositivoDesligadoException("O dispositivo está desligado e não pode ser utilizado!");}
			}
		
		
		
		}catch (DispositivoDesligadoException e) {
			System.out.println("Erro capturado: "+e.getMessage());
		}finally {	
			
			System.out.println("Programa encerrado");
	
		
			
		
		}
		
	
	
}

}

	/*Aluno aluno = new Aluno();
				
				Pessoa pessoaAluno = aluno; //upcasting
				
				Pessoa aluno2 =(Pessoa)new Aluno();//upcasting 2
				
				Aluno aluno2 = (Aluno) pessoaAluno//dowcasting
				
				Pessoa aluno3 = new Pessoa();
				
				Aluno aluno4 = (Aluno) aluno3;
				*/
				
		
	



