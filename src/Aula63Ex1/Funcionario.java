package Aula63Ex1;

public class Funcionario implements Trabalhavel, Avaliavel {

	private String nome;
	private int idade;
	private double salario;
	private String cargo;
	private Departamento dep;
	
	
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Departamento getDep() {
		return dep;
	}

	public void setDep(Departamento dep) {
		this.dep = dep;
	}

	
	
	public Funcionario(String nome, int idade, double salario, String cargo, Departamento dep) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.cargo = cargo;
		this.dep = dep;
	}
	
	

	public void retornarCodigo(int cod){
		
		switch (cod){
		
		case 1:
			System.out.println(dep.TI);
		break;
		
		case 2:
			System.out.println(dep.RH);
		break;
		
		case 3:
			System.out.println(dep.FINANCEIRO);
		break;
		
		default:
			  System.out.println("Departamento não identificado");
		
		}
			
		
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + " Cargo: " + cargo +  "idade=" + idade + ", dep=" + dep + ", salario=" + salario +"";
	}

	@Override
	public String avaliar() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String trabalhar() {
		// TODO Auto-generated method stub
		return "";
	}

}
