package Aula43Ex2;

import java.util.Scanner;

public class Contribuinte {
	
	Scanner scan = new Scanner(System.in);
	
	private String nome;
	private double rendaBruta;
	private double aliquota;
	private double parcelaAdeduzir;
	private double valorAserPago;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getRendaBruta() {
		return rendaBruta;
	}
	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	public double getAliquota() {
		return aliquota;
	}
	public void setAliquota(double aliquota) {
		this.aliquota = aliquota;
	}
	public double getParcelaAdeduzir() {
		return parcelaAdeduzir;
	}
	public void setParcelaAdeduzir(double parcelaAdeduzir) {
		this.parcelaAdeduzir = parcelaAdeduzir;
	}
	
	
	
	public double getValorAserPago() {
		return valorAserPago;
	}
	public void setValorAserPago(double valorAserPago) {
		this.valorAserPago = valorAserPago;
	}
	
	public void CalcularImposto() {
		
		System.out.println("Digite o nome do contribuinte: ");
		setNome(scan.next());
		
		System.out.println("Digite a renda bruta: ");
		setRendaBruta(scan.nextDouble());
		
		if(rendaBruta <=1400) {
			setAliquota(0);
			setParcelaAdeduzir(0);
			
		}
		
		else if(rendaBruta >1400 && rendaBruta <=2100) {
			setAliquota(10);
			setParcelaAdeduzir(100);
		}
		
		else if(rendaBruta >2100 && rendaBruta <=2800) {
			setAliquota(15);
			setParcelaAdeduzir(270);
		}
		
		else if(rendaBruta >2800 && rendaBruta <=3600) {
			setAliquota(25);
			setParcelaAdeduzir(500);
		}
		
		else if(rendaBruta >3600) {
			setAliquota(30);
			setParcelaAdeduzir(700);
		}
		
		setValorAserPago(((aliquota*rendaBruta)/100)-parcelaAdeduzir);
		/*
		System.out.println("Nome: " + getNome());
		System.out.println("A aliquota é " + getAliquota());
		System.out.println("O valor a ser pago é " + getParcelaAdeduzir());
		*/
	}
	@Override
	public String toString() {
		return " \n Nome: " + nome + "\n Renda Bruta: " + rendaBruta + "\n Alíquota: " + aliquota
				+ "\n Parcela a deduzir: " + parcelaAdeduzir + "\n Valor a ser pago: " + valorAserPago;
	}
	
		

}
