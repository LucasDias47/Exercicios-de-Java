package Aula58Ex1;

public enum TipoCombustivel {

	GASOLINA{
		@Override
		public String descricao(String nome, String descricao) {
			return "Gasolina  " + "veiculo a gasolina";
		}
	},
	
	DIESEL{
		@Override
		public String descricao(String nome, String descricao) {
			return "Diesel " + "veiculo a diesel";
		}
	}, 
	
	ELETRICO{
		@Override
		public String descricao(String nome, String descricao) {
			return "Elétrico " + "veiculo elétrico";
		}
	};
	
	
	
	
	private String descricao;

	
	
	private TipoCombustivel() {
		
	}



	public abstract String descricao(String nome, String descricao);
	
	
	
	
}
