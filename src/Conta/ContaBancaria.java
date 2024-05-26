package Conta;

import Conta.NumeroDeConta.Numero;

public abstract class ContaBancaria {

    private static int AGENCIA_PADRAO = 1;

    protected Numero numero;
    protected double saldo;
    protected Cliente cliente;

    public ContaBancaria(Numero numero, double saldo, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public Numero getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void sacar() {

    }

    public void depositar() {

    }

    public void transferir(double valor, ContaBancaria contaDeDestino) {

    }
}
