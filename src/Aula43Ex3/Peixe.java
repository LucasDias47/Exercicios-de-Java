package Aula43Ex3;

import java.util.Scanner;

public class Peixe extends Animais{
	
	private String caracteristicas;

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

@Override
public void coletarInfo() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome do animal: ");
		setNome(scan.next());
		
		System.out.println("Digite o comprimento em cm: ");
		setComprimento(scan.nextDouble());
		
		System.out.println("Digite a quantidade de patas: ");
		setPatas(scan.nextInt());
		
		System.out.println("Digite a cor: ");
		setCor(scan.next());
		
		System.out.println("Digite o ambiente: ");
		setAmbiente(scan.next());
		
		System.out.println("Digite a velocidade em m/s: ");
		setVelocidade(scan.nextDouble());
		
		System.out.println("Digite a característica: ");
		setCaracteristicas(scan.next());
	}

	@Override
	public String toString() {
		String s = "";
		s += super.toString();
		s += "\n Caracteristicas: " +caracteristicas;
		return s;
	}
		
		
	/*
	@Override
	public void mostrarInfo() {
		System.out.println("Animal: " + getNome());
		System.out.println("Comprimento: "+ getComprimento()+" cm");
		System.out.println("Patas: "+ getPatas());
		System.out.println("Cor: "+ getCor());
		System.out.println("Ambiente: "+ getAmbiente());
		System.out.println("Velocidade: "+ getVelocidade() + " m/s");
		System.out.println("Caracteristica: "+getCaracteristicas());
		System.out.println("-----------------------");
		
		
	}
	*/
}
