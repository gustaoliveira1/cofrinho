package view;

import core.Cofrinho;

public class TotalConvertidoEmReais {
    Cofrinho cofrinho;

    public TotalConvertidoEmReais(Cofrinho cofrinho) {
        this.cofrinho = cofrinho;
    }

    public void displayTotalConvertido() {
        double total = this.cofrinho.totalConvertido();

        System.out.printf("R$ %.2f \n", total);
    }
}
