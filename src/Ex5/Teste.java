package Ex5;

public class Teste {

	public static void main(String[] args) {
		
		GerenciadorUsuarios gerenciador = new GerenciadorUsuarios();
		
		Thread adc = new Thread(() -> {
			
			gerenciador.adicionarUsuario("Alice");
			gerenciador.adicionarUsuario("Bob");
			gerenciador.adicionarUsuario("Charlie");
			//gerenciador.removerUsuario("Alice");
			gerenciador.adicionarUsuario("Alice");
			
		
		});
		
		Thread rem = new Thread(() ->{
			
			gerenciador.removerUsuario("Alice");
		});
		
		Thread list  = new Thread(() -> {
			
			gerenciador.listarUsuarios();
		});
		
		adc.start();
		
		/*
		
		try {
			rem.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		rem.start();
		
		try {
			Thread.currentThread().sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		try {
			adc.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		list.start();
	}

}
