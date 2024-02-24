import core.Cofrinho;
import core.moedas.*;
import view.ListarMoedas;
import view.MainMenu;
import view.TipoMoedaMenu;
import view.TotalConvertidoEmReais;
import view.ValorMoedaMenu;

public class Principal {
    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();

        MainMenu mainMenu = new MainMenu();
        TipoMoedaMenu tipoMoedaMenu = new TipoMoedaMenu();
        ValorMoedaMenu valorMoedaMenu = new ValorMoedaMenu();

        while (true) {
            mainMenu.displayMainMenu();
            int value = mainMenu.getValidatedMainMenuInput();

            if (value == 1) {
                tipoMoedaMenu.displayRemoverMoedasMenu();
                int tipoMoeda = tipoMoedaMenu.getValidatedTipoMoedaMenuInput();

                valorMoedaMenu.displayValorMoedaMenu();
                double valorMoeda = valorMoedaMenu.getValidatedValorMoedaMenuInput();

                Moeda moeda;

                if (tipoMoeda == 1) {
                    moeda = new Real(valorMoeda);
                } else if (tipoMoeda == 2) {
                    moeda = new Dolar(valorMoeda);
                } else {
                    moeda = new Euro(valorMoeda);
                }

                cofrinho.adicionar(moeda);
                System.out.println("[INFO] Moeda adicionada com sucesso!");

            } else if (value == 2) {
                tipoMoedaMenu.displayRemoverMoedasMenu();
                int tipoMoeda = tipoMoedaMenu.getValidatedTipoMoedaMenuInput();

                valorMoedaMenu.displayValorMoedaMenu();
                double valorMoeda = valorMoedaMenu.getValidatedValorMoedaMenuInput();

                cofrinho.remover(tipoMoeda, valorMoeda);

            } else if (value == 3) {
                ListarMoedas listarMoedas = new ListarMoedas(cofrinho);
                listarMoedas.displayListaMoedas();

            } else if (value == 4) {
                TotalConvertidoEmReais totalConvertidoEmReais = new TotalConvertidoEmReais(cofrinho);
                totalConvertidoEmReais.displayTotalConvertido();

            } else if (value == 0) {
                System.out.println("Bye Bye...");
                System.exit(0);
            }
        }
    }
}
