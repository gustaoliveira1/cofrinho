
package view;

import java.util.Scanner;

public class ValorMoedaMenu {
    Scanner scanner = new Scanner(System.in);

    public void displayValorMoedaMenu() {
        System.out.println("Digite o valor da moeda: ");
    }

    public double getValidatedValorMoedaMenuInput() {
        while (true) {
            try {
                double input = this.scanner.nextDouble();

                if (input > 0) {
                    return input;
                }

                throw new IllegalArgumentException("Invalid Input Range");
            } catch (Exception e) {
                System.out.println("[ERROR] Valor de entrada não válido, tente novamente, o número deve ser um inteiro ou decimal, separado por vírgula.");
                this.scanner.nextLine();
            }
        }
    }

}
