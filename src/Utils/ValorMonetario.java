package Utils;

public class ValorMonetario {
    private double valor;

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
        this.valor -= valor.valor
    }

}
