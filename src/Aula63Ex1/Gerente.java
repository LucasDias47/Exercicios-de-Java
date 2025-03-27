package Aula63Ex1;

public class Gerente extends Funcionario{

	public Gerente(String nome, int idade, double salario, String cargo, Departamento dep) {
		super(nome, idade, salario, cargo, dep);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String avaliar() {
		
		return  "["+getNome() + " avaliando equipe]";
	}

	@Override
	public String trabalhar() {
		
		return "["+getNome() + " trabalhando como Gerente]";
	}
}
