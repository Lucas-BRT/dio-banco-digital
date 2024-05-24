public abstract class ContaBancaria {
    protected int numero;
    protected int digito;
    protected String nomeCiente;
    protected double saldo;
    protected Cliente cliente;

    public int getNumero() {
        return numero;
    }

    public int getDigito() {
        return digito;
    }

    public String getNomeCiente() {
        return nomeCiente;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    protected void sacar() {

    };

    protected void transferir(double valor, ContaBancaria contaDeDestino) {

    }


}
