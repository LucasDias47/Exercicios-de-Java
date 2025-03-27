package Aula43Ex3;

import java.util.Scanner;
import java.util.Locale;

public class Animais {
	
	private String nome;
	private double comprimento;
	private int patas;
	private String cor;
	private String ambiente;
	private double velocidade;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	public void coletarInfo() {
		
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Digite o nome do animal: ");
		setNome(scan.next());
		
		System.out.println("Digite o comprimento em cm: ");
		setComprimento(scan.nextDouble());
		
		System.out.println("Digite a quantidade de patas: ");
		setPatas(scan.nextInt());
		scan.nextLine();
		
		System.out.println("Digite a cor: ");
		setCor(scan.next());
		
		System.out.println("Digite o ambiente: ");
		setAmbiente(scan.next());
		
		System.out.println("Digite a velocidade em m/s: ");
		setVelocidade(scan.nextDouble());
	}
	@Override
	public String toString() {
		return "\n Animal: " + nome + "\n Comprimento: " + comprimento +" cm" +"\n Patas: " + patas + "\n Cor:" + cor
				+ "\n Ambiente: " + ambiente + "\n Velocidade: " + velocidade + " m\s";
	}
	
	
	
	/*
	public void mostrarInfo() {
		
		System.out.println("Animal: " + getNome());
		System.out.println("Comprimento: "+ getComprimento()+" cm");
		System.out.println("Patas: "+ getPatas());
		System.out.println("Cor: "+ getCor());
		System.out.println("Ambiente: "+ getAmbiente());
		System.out.println("Velocidade: "+ getVelocidade() + " m/s");
		System.out.println("-----------------------");
	
	}
	 */	
}
