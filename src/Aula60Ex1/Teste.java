package Aula60Ex1;
import static java.lang.Math.sqrt;

import Aula58Ex1.CarroEletrico;

public class Teste {

	public static void main(String[] args)  {
		
		Carro carro1 = new Carro("Toyota","Corolla",2022, Categoria.ECONOMICO );
		Moto moto1 = new Moto("Honda","CB500", 2023, Categoria.LUXO);
		Hibrido carro2 = new Hibrido("Ford", "Fusion", 2021, Categoria.LUXO);
		
		Veiculo[] veiculos = new Veiculo[4];
		
		veiculos[0]=carro1;
		veiculos[1]=moto1;
		veiculos[2]=carro2;
		
		for(Veiculo v: veiculos) {
			
			if(v instanceof Carro) {
			System.out.println(	v.mostrarDetalhes());
			}
			
			else if(v instanceof Moto) {
			System.out.println(	v.mostrarDetalhes());
			}
			
			else if(v instanceof Hibrido) {
				System.out.println(	v.mostrarDetalhes());
				/*
				 * CarroEletrico nCar2 = (CarroEletrico)a;
				((CarroEletrico )a).carregarBateria();
				 */
				
				Hibrido nCar2 = (Hibrido)v;
				((Hibrido)v).abastecer();
				((Hibrido)v).abastecerEletrico();
			}
			
		}
		
		for (Veiculo c: veiculos) {
			if(c instanceof Carro) {
				Carro carro  = (Carro) c;
				System.out.println("Veículo é um Carro!");
                System.out.println("Modelo específico: " + carro.getModelo());
			}
		}
		
		try {
			if(veiculos.length >3) {
				throw new VeiculoNaoEncontradoException("Erro: Veículo não encontrado no índice especificado!");
			}
		}catch(VeiculoNaoEncontradoException e) {
			System.out.println(e.getMessage());
		}
		
		Integer ano = 2022;
		int proximoAno = ano +1;
		System.out.println("\nDemonstração de Autoboxing e Unboxing:");
		System.out.println("Ano inicial: " + ano + ", Próximo ano: " + proximoAno);
		System.out.println("\nUso de static import para raiz quadrada: " + sqrt(49));  
		//System.out.println("HELL");
	}

}
