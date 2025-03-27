package Aula71Ex3;

import Aula69Ex4.ContaCorrente;
import Aula69Ex4.SaldoinsuficienteException;

public class Teste {

	public static void main(String[] args) {

		Dispositivo dh1 = new Dispositivo();
		Smartphone ph1 = new Smartphone();
		SmartTv tv1 = new SmartTv();

		dh1.setStatus(StatusRede.CONECTADO);
		ph1.setStatus(StatusRede.DESCONECTADO);
		tv1.setStatus(StatusRede.EM_ESPERA);

		Dispositivo[] disp = new Dispositivo[3];

		disp[0]=ph1;
		disp[1]=tv1;
		disp[2]=dh1;

		for(Dispositivo d : disp) {

			if(d instanceof Smartphone) {
				d.conectar();
				d.ligar();
				((Smartphone) d).tirarFoto();

			}

			if(d instanceof SmartTv) {
				d.conectar();
				d.ligar();
				((SmartTv) d).mudarCanal(5);


			}	



		}

		for(Dispositivo d2 : disp) {
			System.out.println("Enum Status: "+ d2.getStatus().descricao(null, null) );
		}

		AtualizandoSistema at = new AtualizandoSistema(1);
		//SincronizandoDados si = new SincronizandoDados(2);
		SincronizandoDados si2 = new SincronizandoDados("2");
		SincronizandoDados si3 = new SincronizandoDados("3");
		
		Thread a1 = new Thread(at);
		//Thread s1 = new Thread(si);
		
		Thread s2 = new Thread(si2);
		Thread s3 = new Thread(si3);

		a1.start();
		//s1.start();
		s2.start();
		s3.start();
		
		
		try {
			a1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		try {
			s1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		*/
		ph1.desligar();

		try {
			ph1.tirarFoto();

			if(ph1.ligar(false)) {

				throw new DispositivoNaoConectadoException("Exceção capturada: O dispositivo não está conectado!"); 
			}
		}catch(DispositivoNaoConectadoException e) {
			System.out.println(e.getMessage());
		}


	}



}


