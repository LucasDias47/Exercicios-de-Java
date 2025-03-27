package Aula58Ex1;

import Aula56Ex3.ContaPoupanca;

public class Teste {

	public static void main(String[] args) throws VelocidadeExcedidaException{
		
		Carro carro1 = new Carro("Toyota", "Corolla", 0);
		CarroEletrico carro2  = new CarroEletrico("Tesla", "Model 3", 0);
		
		Automovel[] autos = new Automovel[2];
		
		autos[0]=carro1;
		autos[1]=carro2;
		
		for(Automovel a : autos) {
			System.out.println(a.toString());
			
			if (a instanceof CarroEletrico) {
				/*
				 * 	ContaPoupanca nCon2 = (ContaPoupanca)c;
				((ContaPoupanca )c).renderJuros();
				 */
				
				CarroEletrico nCar2 = (CarroEletrico)a;
				((CarroEletrico )a).carregarBateria();
				
				try {	
				((CarroEletrico) a).acelerar();
				double limite = 120;
				//a.velocidadeAtual= 200;
				
	
				if(((CarroEletrico) a).getVelocidadeAtual() > limite) {
					throw new VelocidadeExcedidaException("Exceção: Velocidade excedida! Reduzindo para o limite permitido. ");
				}
				
				}catch(VelocidadeExcedidaException e) {
					System.out.println(e.getMessage());
				}
			}
				
			
		}
		
		Integer num = 120;
		int num2 = num;
		
		System.out.println("Autoboxing: Integer = " + num);
		System.out.println("Unboxing: int = " + num2);
		
		System.out.println(TipoCombustivel.GASOLINA.descricao(null, null));
		System.out.println(TipoCombustivel.DIESEL.descricao(null, null));
		System.out.println(TipoCombustivel.ELETRICO.descricao(null, null));
		
		TipoCombustivel tip1 =  TipoCombustivel.valueOf("GASOLINA");
		System.out.println(tip1);
		//System.out.println(TipoCombustivel.GASOLINA.getClass());
		
	}

}
