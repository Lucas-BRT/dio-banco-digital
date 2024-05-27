package Banco.Conta;
import Banco.Utils.ValorMonetario;

public class Cliente {
    private String nome;
    private int idade;
    private ValorMonetario rendaMensal;

    public Cliente(String nome, int idade, ValorMonetario rendaMensal) {
        this.nome = nome;
        this.idade = idade;
        this.rendaMensal = rendaMensal;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + " " + idade + " Anos";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public ValorMonetario getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(ValorMonetario rendaMensal) {
        this.rendaMensal = rendaMensal;
    }
}
