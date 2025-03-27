package Aula72Ex3;

public class Impressora implements Runnable{

	//private int[] documentos= new int[1];
	private int documentoAtual = 0;
	private boolean documentoDisponivel = false;
	
	
	
	public Impressora() {
		
		Thread t = new Thread(this);
		t.start();
		
	}

	public synchronized void imprimirDocumento(int documento) throws InterruptedException{
		
		while(documentoDisponivel) {
			wait();
		}
		
	documentoAtual=documento;
	documentoDisponivel = true;
	System.out.println("Impressora: Documento "+ documento + " foi impresso!");
	notifyAll();
	
	}
	
	public synchronized void pegarDocumento(int UsuarioNum) throws InterruptedException{
		
		while(!documentoDisponivel){
			wait();
		}
		
		System.out.println("Usuário "+ UsuarioNum +" pegou o Documento "+ documentoAtual+"");
		documentoDisponivel = false;
		notifyAll();
	}

	
	@Override
	public void run() {
		//Impressora impressora = new Impressora(documentos, documentoDisponivel);
		
		for(int i = 1 ; i<=5; i++) {
			try {
				imprimirDocumento(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
