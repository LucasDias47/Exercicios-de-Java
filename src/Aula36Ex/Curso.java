package Aula36Ex;

public class Curso {
	
	private String nome;
	private String horario;
	private Professor professor;
	private Aluno[] alunos;
	private Aluno[] getAlunos() {
		return alunos;
	}
	void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	private Professor getProfessor() {
		return professor;
	}
	void setProfessor(Professor professor) {
		this.professor = professor;
	}
	private String getHorario() {
		return horario;
	}
	void setHorario(String horario) {
		this.horario = horario;
	}
	private String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	
	public String obterInfo() {
		String info = "Nome do Curso = " + nome + "\n";
		
		if(professor != null) {
			info += professor.obterInfo();
		}
		
		if (alunos != null) {
			System.out.println("---Alunos---");
			for (Aluno aluno : alunos){
				if (aluno != null) {
				info += aluno.obterInfo();
				info += "\n";
			}
		}
		
		info += "\nMédia da turma = " + obterMediaTurma();
		
		}
		return info;
		
	}
	
	public double obterMediaTurma() {
		double soma =  0;
		for (Aluno aluno : alunos){
			if (aluno != null) {
			soma += aluno.obterMedia();
		}
	}
		return soma/alunos.length;
	}

}


