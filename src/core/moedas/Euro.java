package core.moedas;

public class Euro extends Moeda {
    public Euro(double valor) {
        this.valor = valor;
    }

    @Override
    public double converter() {
        return valor * 5.32;
    }

    public void info() {
        System.out.println("Euro - " + this.valor);
    }
}
