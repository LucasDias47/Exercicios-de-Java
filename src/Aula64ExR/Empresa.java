package Aula64ExR;

//Interface para a classe anônima
interface Trabalho {
 void executarTarefa();
}

//Classe externa
class Empresa {

 // Classe interna
 class Departamento {
     void mostrarDepartamento() {
         System.out.println("Departamento: Tecnologia");
     }
 }

 // Método com classe local
 public void mostrarInformacoes() {
     class Funcionario {
         void mostrarFuncionario() {
             System.out.println("Funcionário: João Silva");
         }
     }
     
     Funcionario funcionario = new Funcionario();
     funcionario.mostrarFuncionario();
 }
}

public class Teste {
 public static void main(String[] args) {
     // Instanciando a classe externa
     Empresa empresa = new Empresa();

     // Criando e chamando a classe interna
     Empresa.Departamento depto = empresa.new Departamento();
     depto.mostrarDepartamento();

     // Chamando o método que tem a classe local
     empresa.mostrarInformacoes();

     // Criando a classe anônima
     Trabalho tarefa = new Trabalho() {
         @Override
         public void executarTarefa() {
             System.out.println("Tarefa em andamento...");
         }
     };
     
     tarefa.executarTarefa();
 }
}
