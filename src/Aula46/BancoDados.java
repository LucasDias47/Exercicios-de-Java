package Aula46;

public interface BancoDados extends SqlDCL, SqlDDL, SqlDML {

	void abrirConexao();
	
	void fecharConxao();
}
