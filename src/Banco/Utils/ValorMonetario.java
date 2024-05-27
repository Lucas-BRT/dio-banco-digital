package Banco.Utils;

public class ValorMonetario {
    private double valor;

    public ValorMonetario(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void somar(ValorMonetario valor) {
        this.valor += valor.valor;
    }

    public void subtrait(ValorMonetario valor) {
        this.valor -= valor.valor;
    }

    @Override
    public String toString() {
        return "R$: " + valor;
    }
}
