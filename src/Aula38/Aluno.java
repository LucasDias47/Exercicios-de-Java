package Aula38;

public class Aluno extends Pessoa{
	
	private String curso;
	private double[]notas;
	private String nomeVisibilidade;
	
	public void verificarAcesso(){
		
		this.nomeVisibilidade = "sdffdff";
		super.nomeVisilidade = "sdsdfdf";
		
		this.setNomeVisibilidade("sdfdfdf");
	}
	
	private void setNomeVisibilidade(String string) {
		// TODO Auto-generated method stub
		
	}

	public Aluno() {
		super();
		
	}
	
	

	public Aluno(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		this.curso = curso;
		// TODO Auto-generated constructor stub
	}



	
	
	
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado(){
		return true;
	}
	
	public void metodoQualquer(){
		super.setCpf("4354545345");
		
		this.setCpf("456566");
	}
	
	

}
