package Banco.Conta;

import Banco.Utils.ValorMonetario;

public abstract class ContaBancaria {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;


    protected Numero numero;
    protected ValorMonetario saldo = new ValorMonetario(0.0);
    protected Cliente cliente;

    public ContaBancaria(Cliente cliente) {
        this.numero = new Numero(SEQUENCIAL++, AGENCIA_PADRAO);
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Conta: " + numero + ", " + saldo +
                ", " + cliente;
    }

    public Numero getNumero() {
        return numero;
    }

    public ValorMonetario getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void sacar(ValorMonetario quantidade) {
        this.saldo.subtrait(quantidade);
    }

    public void depositar(ValorMonetario quantidade) {
        this.saldo.somar(quantidade);
    }

    public void transferir(ValorMonetario quantidade, ContaBancaria contaDeDestino) {
        this.saldo.subtrait(quantidade);
        contaDeDestino.saldo.somar(quantidade);
    }
}
