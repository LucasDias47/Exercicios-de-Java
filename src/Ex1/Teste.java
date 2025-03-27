package Ex1;

public class Teste {

	public static void main(String[] args) {

		Carro car1 = new Carro();
		Carro car2 = new Carro();
		Moto mot1 = new Moto();

		car1.setModelo("Sedan");

		car1.setNome("Carro A");
		car2.setNome("Carro B");
		mot1.setNome("Moto c");

		car1.acelerar();

		mot1.acelerar();

		Veiculo[] veiculos = new Veiculo[2];

		veiculos[0]= car1;
		veiculos[1]=mot1;

		for(Veiculo v:veiculos) {

			if (v instanceof Carro) {
				System.out.println("Este veículo é um carro! Modelo: "+v.getModelo());
			}

		}

		Estacionamento estacionamento = new Estacionamento(2);

		////////////////continua aqui

		Thread t1 = new Thread(() -> {

			try {
				estacionamento.estacionar(car1);
				Thread.sleep(2000);
				estacionamento.sairDoEstacionamento(car1);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});
		
		Thread t2 = new Thread(()->{
			
			try {
				estacionamento.estacionar(car2);
			Thread.sleep(3000);
			estacionamento.sairDoEstacionamento(car2);
			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		});
		
		Thread t3 = new Thread(()->{
			
			try {
				estacionamento.estacionar(mot1);
				Thread.sleep(1000);
				estacionamento.sairDoEstacionamento(mot1);
			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
		});

		t1.start();
		t2.start();
		t3.start();
	}




}


