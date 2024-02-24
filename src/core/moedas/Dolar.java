package core.moedas;

public class Dolar extends Moeda {
    public Dolar(double valor) {
        this.valor = valor;
    }

    @Override
    public double converter() {
        return valor * 4.93;
    }

    public void info() {
        System.out.println("Dolar - " + this.valor);
    }
}
