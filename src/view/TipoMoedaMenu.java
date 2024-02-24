package view;

import java.util.Scanner;

public class TipoMoedaMenu {
    Scanner scanner = new Scanner(System.in);

    public void displayRemoverMoedasMenu() {
        System.out.println("Escolha Moeda:");
        System.out.println("[1] Real");
        System.out.println("[2] Dolar");
        System.out.println("[3] Euro");
    }

    public int getValidatedTipoMoedaMenuInput() {
        while (true) {
            try {
                int input = this.scanner.nextInt();

                if (input >= 1 && input <= 3) {
                    return input;
                }

                throw new IllegalArgumentException("Invalid Input Range");
            } catch (Exception e) {
                System.out.println("[ERROR] Valor de entrada fora do intervalo válido (1 a 3), tente novamente.");
                this.scanner.nextLine();
            }
        }
    }
}
