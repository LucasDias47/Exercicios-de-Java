package Aula53Ex3;

public class Funcionario {
	
	private String nome;
	private double salario;
	private double bonus;
	private Departamento dep;
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}



	public double getBonus() {
		return bonus;
	}



	public double setBonus(double bonus) {
		return this.bonus = bonus;
	}

	

	public Departamento getDep() {
		return dep;
	}



	public void setDep(Departamento dep) {
		this.dep = dep;
	}



	double calcularBonus() {
		
		return setBonus(salario *1/100);
	}



	@Override
	public String toString() {
		return "Funcionario : " + nome + " - Departamento " + dep + " - salario: " + salario + " - bonus: " + bonus;
		
	}
	
	

}
