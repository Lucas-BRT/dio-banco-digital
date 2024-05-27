package Banco.Conta;

public class Numero {
    private int numero;
    private int digito;

    public Numero(int numero, int digito) {
        this.numero = numero;
        this.digito = digito;
    }

    public int getNumero() {
        return numero;
    }

    public int getDigito() {
        return digito;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Numero numero1 = (Numero) o;
        return numero == numero1.numero && digito == numero1.digito;
    }

    @Override
    public String toString() {
        return numero + "-" + digito;
    }
}
