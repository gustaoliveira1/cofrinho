package view;

import core.Cofrinho;
import core.moedas.Moeda;

public class ListarMoedas {
    Cofrinho cofrinho;

    public ListarMoedas(Cofrinho cofrinho) {
        this.cofrinho = cofrinho;
    }

    public void displayListaMoedas() {
        for (Moeda moeda : cofrinho.listar()) {
            moeda.info();
        }
    }
}
