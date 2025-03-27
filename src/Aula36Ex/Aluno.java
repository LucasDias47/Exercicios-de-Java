package Aula36Ex;

public class Aluno {
	
	private String nome;
	private String matricula;
	private double[] notas;
	
	private double[] getNotas() {
		return notas;
	}
	void setNotas(double[] notas) {
		this.notas = notas;
	}
	private String getMatricula() {
		return matricula;
	}
	void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	private String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	
	public String obterInfo() {
		String info = "Nome Aluno = " + nome + ";";
		info += "Matricula = " + matricula + ";";
		info += "Notas: ";
		
		double soma =  0;
		for(double nota : notas) {
			soma += nota;
			info += nota + " ";
			
		}
		double media = soma/4;
		info += "\n" +  "Média = " + media + " - ";
		if (media >=  7) {
			info += "Aprovado!";
		}else {
			info += "Reprovado!";
		}
		
		return info;		
		
	}
	
	public double obterMedia(){
		
		double soma =  0;
		for(double nota : notas) {
			soma += nota;	
		}
		return soma/4;
	}

}
