package Aula69Ex4;

public enum TipoConta {

	CORRENTE{
		@Override
		public String descricao(String nome, String descricao) {
		
		return "Conta Corrente - " + " Permite cheque especial.";
		}
	}, 
		
	POUPANCA{
		@Override
		public String descricao(String nome, String descricao) {
			return "Conta Poupança - " + "Ideal para guardar dinheiro a longo prazo.";
		}
	};

	private TipoConta() {
		
	}
	public abstract String descricao(String nome, String descricao);
	
}
