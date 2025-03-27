package Aula52Ex4;

public class Teste {

	public static void main(String[] args) throws SaldoInsuficiente {
		
		/*
		 * Criação de Exceção Personalizada:

Crie uma exceção chamada SaldoInsuficienteException, que deve ser lançada quando uma tentativa de saque ultrapassar o saldo da conta.
Classes e Herança:

Crie uma classe Conta com os atributos encapsulados titular (String) e saldo (double).
Crie um método sacar(double valor) que diminua o saldo e lance a exceção personalizada se o saldo for insuficiente.
Crie uma subclasse ContaCorrente que herde de Conta e aplique uma taxa de 5% ao saque.
Polimorfismo e Upcasting/Downcasting:

No método main, crie um array de Conta e adicione diferentes tipos de conta.
Use um loop while para iterar sobre o array e realizar operações de saque.
Utilize instanceof para verificar se uma conta é do tipo ContaCorrente e, se for, faça um downcasting para chamar um método específico dessa classe.
Try-Catch:

Utilize try-catch para capturar a exceção SaldoInsuficienteException e exibir uma mensagem apropriada.
Saída Esperada no Console:
(A saída pode variar dependendo dos valores escolhidos, mas deve seguir um formato semelhante a este)

yaml
Copiar
Editar
Saque realizado com sucesso! Novo saldo: 450.0  
Saldo insuficiente para saque de 600.0. Saldo atual: 450.0  
Conta Corrente detectada. Aplicando taxa de 5%.  
Saque realizado com sucesso! Novo saldo: 380.0  
Saldo insuficiente para saque de 500.0. Saldo atual: 380.0  
		 */

		Conta conta1 = new Conta();
		conta1.setSaldo(900);
		conta1.sacar();
		conta1.sacar();
		
		ContaCorrente conta2 = new ContaCorrente();
		conta2.setSaldo(400);
		conta2.sacar();
		conta2.sacar();
		
		
	}

}
