package view;

import java.util.Scanner;

public class MainMenu {
    Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        System.out.println("COFRINHO");
        System.out.println("[1] Adicionar moeda");
        System.out.println("[2] Remover moeda");
        System.out.println("[3] Listar moedas");
        System.out.println("[4] Valor total convertido em reais");
        System.out.println("[0] Sair");
    }

    public int getValidatedMainMenuInput() {
        while (true) {
            try {
                int input = this.scanner.nextInt();

                if (input >= 0 && input <= 4) {
                    return input;
                }

                throw new Exception("Invalid input range");
            } catch (Exception e) {
                System.out.println("[ERROR] Valor de entrada não válido, tente novamente, um número entre 0 e 4.");
                this.scanner.nextLine();
            }
        }
    }
}
