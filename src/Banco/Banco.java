package Banco;
import Banco.Conta.ContaBancaria;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<ContaBancaria> contas;

    public Banco(String nome) {
        this.contas = new ArrayList<>();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<ContaBancaria> getContas() {
        return contas;
    }

    public void adicionarConta(ContaBancaria conta) {
        this.contas.add(conta);
    }

    @Override
    public String toString() {
        return nome + '\'' + " contas=" + contas;
    }
}
