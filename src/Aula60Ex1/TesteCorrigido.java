package Aula60Ex1;
import static java.lang.Math.sqrt;

public class TesteCorrigido {


interface Motorizado {
    void abastecer();
}

interface Eletrico {
    void abastecer();
}

class Hibrido implements Motorizado, Eletrico {
    @Override
    public void abastecer() {
        System.out.println("Abastecendo veículo híbrido com gasolina...");
    }

    public void abastecerEletrico() {
        System.out.println("Abastecendo veículo híbrido com eletricidade...");
    }
}

abstract class Veiculo {
    private String marca;
    private String modelo;
    private Integer ano;
    private Categoria categoria;

    public Veiculo(String marca, String modelo, Integer ano, Categoria categoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.categoria = categoria;
    }

    public abstract void mostrarDetalhes();

    public String getModelo() {
        return modelo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Integer getAno() {
        return ano;
    }
}

class Carro extends Veiculo {
    public Carro(String marca, String modelo, Integer ano, Categoria categoria) {
        super(marca, modelo, ano, categoria);
    }

    @Override
    public void mostrarDetalhes() {
        double precoBase = 80000;
        double precoFinal = getCategoria().calcularPrecoFinal(precoBase);
        System.out.println("Detalhes do Carro: " + getModelo() + " - " + getAno() +
                " - Categoria: " + getCategoria() + " - Preço Final: " + precoFinal);
    }
}

class Moto extends Veiculo {
    public Moto(String marca, String modelo, Integer ano, Categoria categoria) {
        super(marca, modelo, ano, categoria);
    }

    @Override
    public void mostrarDetalhes() {
        double precoBase = 35000;
        double precoFinal = getCategoria().calcularPrecoFinal(precoBase);
        System.out.println("Detalhes da Moto: " + getModelo() + " - " + getAno() +
                " - Categoria: " + getCategoria() + " - Preço Final: " + precoFinal);
    }
}

enum Categoria {
    ECONOMICO(0.06), LUXO(0.15), SUV(0.20);

    private final double taxa;

    Categoria(double taxa) {
        this.taxa = taxa;
    }

    public double calcularPrecoFinal(double precoBase) {
        return precoBase + (precoBase * taxa);
    }
}

class VeiculoNaoEncontradoException extends Exception {
    public VeiculoNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}

public class Concessionaria {
    public static void main(String[] args) {
        
        Carro carro1 = new Carro("Toyota", "Corolla", 2022, Categoria.ECONOMICO);
        Moto moto1 = new Moto("Honda", "CB500", 2023, Categoria.LUXO);
        
        Veiculo[]veiculos = new Veiculo[2];
        
        for (Veiculo v : veiculos) {
            v.mostrarDetalhes();
        }
      

        Hibrido hibrido = new Hibrido();
        hibrido.abastecer();
        hibrido.abastecerEletrico();

        System.out.println("\nRealizando casting...");
        //Veiculo[] veiculos = {new Carro("Ford", "Fusion", 2021, Categoria.LUXO)};

        for (Veiculo v : veiculos) {
            if (v instanceof Carro) {
                Carro carro = (Carro) v; // Downcasting
                System.out.println("Veículo é um Carro!");
                System.out.println("Modelo específico: " + carro.getModelo());
            }
        }

        try {
            if (veiculos.length < 2) {
                throw new VeiculoNaoEncontradoException("Erro: Veículo não encontrado no índice especificado!");
            }
        } catch (VeiculoNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        Integer ano = 2022;
        int proximoAno = ano + 1; // Unboxing
        System.out.println("\nDemonstração de Autoboxing e Unboxing:");
        System.out.println("Ano inicial: " + ano + ", Próximo ano: " + proximoAno);

        System.out.println("\nUso de static import para raiz quadrada: " + sqrt(49));
    }
}

}
