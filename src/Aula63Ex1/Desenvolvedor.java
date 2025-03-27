package Aula63Ex1;

public class Desenvolvedor extends Funcionario{

	
	
	public Desenvolvedor(String nome, int idade, double salario, String cargo, Departamento dep) {
		super(nome, idade, salario, cargo, dep);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String avaliar() {
		
		return  "["+getNome() +  " revisando código]";
	}

	@Override
	public String trabalhar() {
		
		return "["+getNome() + " trabalhando como Desenvolvedor]";
	}
}
