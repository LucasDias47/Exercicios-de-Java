package Aula43;

import java.util.Arrays;
import java.util.Objects;

public class Aluno{
	
	private String curso;
	private double[]notas;
	private String nomeVisibilidade;
	
	public void verificarAcesso(){
		
		this.nomeVisibilidade = "sdffdff";
		//super.nomeVisilidade = "sdsdfdf";
		
		this.setNomeVisibilidade("sdfdfdf");
	}
	
	private void setNomeVisibilidade(String string) {
		// TODO Auto-generated method stub
		
	}

	public Aluno() {
		super();
		
	}
	
	

	public Aluno(String nome, String endereco, String telefone) {
		//super(nome, endereco, telefone);
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
		//super.setCpf("4354545345");
		
		//this.setCpf("456566");
	}
	
	public String obterEtiquetaEndereco() {
		
		String s = "Endereço do Aluno:  ";
		//s += super.getEndereco();
		
		return s;
	}

	
	public void imprimirEtiquetaEndereco() {
		
		System.out.println(this.obterEtiquetaEndereco());
		
	}

	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + ", nomeVisibilidade=" + nomeVisibilidade
				+ "]";
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		Aluno other = (Aluno) obj;
		
		if(curso.equalsIgnoreCase(other.getCurso())) {
			return true;
		}
		
		return false;
	}
	
	/*
	public String toString() {
		String s = curso + "\n";
		for (double nota : notas) {
			s += nota + " ";
		}
		return s;
	*/
	
	
	
	}


