package Aula56Ex3;

public enum TipoConta {
	
	CORRENTE{
		@Override
		public	String descricao(String nome, String descricao) {
			return "Corrente " + "Conta para movimentação diária" ;
		}
		
	},	
		
	POUPANCA{
		@Override
		public String descricao(String nome, String descricao) {
			return "Poupança " + "Conta que rende juros" ;
		}
	};

	private TipoConta() {
	}
	
	public abstract String descricao(String nome, String descricao);
		// TODO Auto-generated method stub
	


}
