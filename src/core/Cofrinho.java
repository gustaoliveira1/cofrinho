package core;

import java.util.ArrayList;
import java.util.Iterator;

import core.moedas.Dolar;
import core.moedas.Euro;
import core.moedas.Moeda;
import core.moedas.Real;

public class Cofrinho {
    private ArrayList<Moeda> moedas;

    public Cofrinho() {
        this.moedas = new ArrayList<Moeda>();
    }

    public void adicionar(Moeda moeda) {
        this.moedas.add(moeda);
    }

    public void remover(int tipo, double valor) {
        Iterator<Moeda> iterator = this.moedas.iterator();
        while (iterator.hasNext()) {
            Moeda moeda = iterator.next();
            if (moeda.valor == valor) {
                if ((moeda instanceof Real && tipo == 1) ||
                        (moeda instanceof Dolar && tipo == 2) ||
                        (moeda instanceof Euro && tipo == 3)) {
                    iterator.remove();
                    System.out.println("[INFO] Moeda removida com sucesso");
                    return;
                }
            }
        }

        System.out.println("[ERRO] Não foi possível encontrar a moeda");
    }

    public ArrayList<Moeda> listar() {
        return this.moedas;
    }

    public double totalConvertido() {
        double totalEmReais = 0;

        for (Moeda m : this.moedas) {
            totalEmReais += m.converter();
        }

        return totalEmReais;
    }
}